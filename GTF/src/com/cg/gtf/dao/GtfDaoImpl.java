package com.cg.gtf.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.gtf.dto.Queryform;


@Repository("gtfdao")
public class GtfDaoImpl implements GtfDao
{
	@PersistenceContext
	EntityManager em;

	@Override
	public Queryform searchquery(int queryId) {
		// TODO Auto-generated method stub
		Query querySearch = em.createQuery("Select p from Queryform p");
		List<Queryform> list=querySearch.getResultList();
		for (Queryform qq : list) {
			if(qq.getQueryId()==queryId){
				
				Query querySearch1 = em.createQuery("From Queryform where queryId=:qdata");
				querySearch1.setParameter("qdata",queryId);
				Queryform query= (Queryform) querySearch1.getSingleResult();
				return query;
				
			}
		}
		
		return null;
			
	
	}

	@Override
	public Queryform updatequery(Queryform query) {
		// TODO Auto-generated method stub
		
		Queryform QueryThree= em.merge(query);
				//createQuery("UPDATE Queryform SET solution=:sol,answerBy=:ans WHERE queryId=:qid");
		/*QueryThree.setParameter("qid",query.getQueryId());
		QueryThree.setParameter("sol",query.getSolution());
		QueryThree.setParameter("ans",query.getAnswerBy());*/
		
		
		/*Query querySearch1 =em.createQuery("FROM Queryform WHERE queryId=:querydata2");
		querySearch1.setParameter("querydata2",query.getQueryId());
		Queryform querySearch2=(Queryform) querySearch1.getResultList();*/
		
		// TODO Auto-generated method stub
		return QueryThree;
	}

}
