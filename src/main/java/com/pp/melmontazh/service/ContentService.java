package com.pp.melmontazh.service;

import java.util.List;

public interface ContentService {
	public void saveObj(Object obj);
	public <T> List<T> getAll(Class<T> clazz);
	Object getById(String clazzString, final Object id);
	
}
