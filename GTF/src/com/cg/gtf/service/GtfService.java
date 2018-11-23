package com.cg.gtf.service;

import com.cg.gtf.dto.Queryform;

public interface GtfService 
{
	public Queryform searchquery(int queryId);
	public Queryform updatequery(Queryform query);

}
