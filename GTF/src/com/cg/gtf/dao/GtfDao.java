package com.cg.gtf.dao;

import com.cg.gtf.dto.Queryform;

public interface GtfDao 
{
	public Queryform searchquery(int queryId);
	public Queryform updatequery(Queryform query);

}
