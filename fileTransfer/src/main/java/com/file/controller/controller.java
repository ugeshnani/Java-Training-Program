package com.file.controller;



import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.file.dao.sqlData;

@Controller
public class controller {
	
	
	private sqlData sql;
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	@ResponseBody
	public String home() throws ClassNotFoundException, SQLException 
	{
		ModelAndView mv = new ModelAndView();
		System.out.println("inside /");
		mv.setViewName("fileUpoad.jsp");
		Object ob =sql.getData();
		mv.addObject(mv);
		System.out.println("before printing obj");
		System.out.println(ob.toString());
		
		return "Hello";
	}
	
	@RequestMapping("/hi")
	@ResponseBody
	public String hi() 
	{
		/*
		 * ModelAndView mv = new ModelAndView(); System.out.println("inside /");
		 * mv.setViewName("fileUpoad.jsp"); Object ob =sql.getData(); mv.addObject(mv);
		 * System.out.println("before printing obj"); System.out.println(ob.toString());
		 */
		
		return "Hello";
	}
}

