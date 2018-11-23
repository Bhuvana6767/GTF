package com.cg.gtf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.gtf.dao.GtfDao;
import com.cg.gtf.dto.Queryform;


@Service("gtfservice")
@Transactional
public class GtfServiceImpl implements GtfService
{
	@Autowired
	GtfDao dao;

	@Override
	public Queryform searchquery(int queryId) {
		// TODO Auto-generated method stub
		return dao.searchquery(queryId);
	}

	@Override
	public Queryform updatequery(Queryform query) {
		// TODO Auto-generated method stub

		return dao.updatequery(query);
	}

}
