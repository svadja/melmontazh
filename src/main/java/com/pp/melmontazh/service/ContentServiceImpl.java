package com.pp.melmontazh.service;

import java.util.List;

import org.crsh.term.TermEvent.Break;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
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

	@Override
	public List getItemsForPage(String clazz, String group, int itemsOnPage, int page) {
	//	String query = "Select  * From products ORDER BY ID LIMIT 3 OFFSET 1";
		String table="";
		//on java 7 can use switch
		if (clazz.equals("Product")){
			table="Products";
		}
		
		if (clazz.equals("Service")){
			table="Services";
		}
		String query = "SELECT * FROM "+ table + "ORDER BY ID LIMIT "+itemsOnPage+" OFFSET " + (page-1)*itemsOnPage;
		System.err.println(query);
		return null;
	}
	
	

}
