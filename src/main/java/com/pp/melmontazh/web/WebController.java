package com.pp.melmontazh.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pp.melmontazh.dao.DAO;
import com.pp.melmontazh.domain.Contact;
import com.pp.melmontazh.domain.Product;
import com.pp.melmontazh.domain.Service;
import com.pp.melmontazh.service.ContentService;

@Controller
public class WebController {
	@Autowired
	private DAO daoI;
	
	@Autowired
	private ContentService contentService;
	
	@RequestMapping(value="/about", method = RequestMethod.GET)
	public String about(){
		return "about";
		
	}
	
	@RequestMapping(value="/uploadimg", method = RequestMethod.GET)
	public String uploadimg(){
		return "uploadimg";
		
	}
	
	
	@RequestMapping(value="/products", method = RequestMethod.GET)
	public String showProducts(Model m){
		m.addAttribute("products", contentService.getAll(Product.class) );
		return "products";
	}
	
	
	/*---Product---*/
	@RequestMapping(value="/eProduct", method = RequestMethod.GET)
	public String loadEditorProduct(Model m){
		m.addAttribute("product",new Product());
		return "formProduct";
	}
	
	@RequestMapping(value="/eProduct", method = RequestMethod.POST)
	public String loadEditorProduct(@ModelAttribute Product product){
		daoI.saveOrUpdate(product);
		return "about";
	}
	/*---END Product---*/
	
	/*---Service---*/
	@RequestMapping(value="/eService", method = RequestMethod.GET)
	public String loadEditorService(Model m){
		m.addAttribute("service",new Service());
		return "formService";
	}
	
	@RequestMapping(value="/eService", method = RequestMethod.POST)
	public String loadEditorProduct(@ModelAttribute Service service){
		daoI.saveOrUpdate(service);
		return "about";
	}
	
	/*---END Service---*/
	
	
	/*---Contact---*/
	@RequestMapping(value="/eContact", method = RequestMethod.GET)
	public String loadEditorContact(Model m){
		m.addAttribute("contact",new Contact());
		return "formContact";
	}
	
	@RequestMapping(value="/eContact", method = RequestMethod.POST)
	public String loadEditorContact(@ModelAttribute Contact contact){
		daoI.saveOrUpdate(contact);
		return "about";
	}
	/*---END Contact---*/
	
	
}
