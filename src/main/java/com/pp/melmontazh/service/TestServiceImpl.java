package com.pp.melmontazh.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.pp.melmontazh.dao.DAO;
import com.pp.melmontazh.domain.TestDomain;

public class TestServiceImpl implements TestService{
	@Autowired
	private DAO	daoI;
	public void save(TestDomain td){
		daoI.saveOrUpdate(td);
	}
}
