package com.pp.melmontazh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pp.melmontazh.dao.DAO;

public class ContentServiceImpl implements ContentService {
	
	@Autowired
	private DAO	daoI;
	
	
	@Override
	public void saveObj(Object obj) {
		daoI.saveOrUpdate(obj);
		
	}

	@Override
	public <T> List<T> getAll(Class<T> clazz) {
		return daoI.getAll(clazz);
	}

	@Override
	public Object getById(String clazzString, Object id) {
		if (id instanceof String ) {
			return daoI.getById(clazzString,(String)id);
		} else if (id instanceof Long ) {
			return daoI.getById(clazzString,(Long)id);
		}
		return null;
	}

}
