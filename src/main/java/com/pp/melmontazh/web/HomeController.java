package com.pp.melmontazh.web;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pp.melmontazh.dao.DAO;
import com.pp.melmontazh.dao.DAOImpl;
import com.pp.melmontazh.domain.TestDomain;
import com.pp.melmontazh.service.TestService;
import com.pp.melmontazh.service.TestServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private TestService testService;
	
	@Autowired
	private DAO daoI;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
/*/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	*/

    
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public void testc(){
	//	TestDomain td = new TestDomain("Boom2");
//		daoI.saveOrUpdate(td);
//		testService.save(td);
	
	}
	
}
