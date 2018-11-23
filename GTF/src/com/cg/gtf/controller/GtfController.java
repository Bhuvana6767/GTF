package com.cg.gtf.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.gtf.dto.Queryform;
import com.cg.gtf.service.GtfService;

@Controller
public class GtfController 
{
	@Autowired
	GtfService gtfservice;
	
	@RequestMapping(value="searchquery", method=RequestMethod.GET)
	public String searchData(@ModelAttribute("yy") Queryform query){
		return "searchquery";
	}
	
	
	@RequestMapping(value="querysearch", method=RequestMethod.POST)
	public ModelAndView dataSearch(@ModelAttribute("yy") Queryform query,Model model){
		System.out.println("second page");
		Queryform qSearch = gtfservice.searchquery(query.getQueryId());
		if(qSearch!=null)
		{
			model.addAttribute("answerBy",new String[] {"Uma","Rahul","Kavitha","Hema"});
			return new ModelAndView("showsearch","temp", qSearch);
		}
		else
			return new ModelAndView("error","temp", query.getQueryId());
		
		
		

		
		
	}
	
	@RequestMapping(value="success")
	public String updatequery(@ModelAttribute("yy") Queryform query,Model model)
	{
		
		System.out.println(query.getQueryId()+query.getQuestion()+query.getSolution());
		Queryform q1=gtfservice.updatequery(query);
		
		/*List<String> answerBy=new ArrayList<String>();
		answerBy.add("Uma");
		answerBy.add("Rahul");
		answerBy.add("Kavitha");
		answerBy.add("Hema");
		model.addAttribute("answerBy", answerBy);
		model.addAttribute("query",query);*/
		model.addAttribute("id",q1.getQueryId());
		
		/*Queryform q1=service.updatequery(query);
		System.out.println(query);
*/

		return "updatesuccess";
	}

	
}


