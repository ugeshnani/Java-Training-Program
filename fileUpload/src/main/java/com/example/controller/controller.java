package com.example.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.method.support.ModelAndViewContainer;

import com.example.dao.dao;


@Controller
public class controller {

	@Autowired
	private dao sql;

	
	@RequestMapping("/")
	public ModelAndViewContainer home() throws ClassNotFoundException, SQLException
	{
		ModelAndViewContainer mv = new ModelAndViewContainer();
		System.out.println("inside /");
		mv.setViewName("fileUpoad.jsp");
		Object ob =sql.getData();
		mv.addAttribute(ob);
		System.out.println(ob);
		
		return mv;
	}
	@RequestMapping("/align")
	public String align()
	{
		System.out.println("Inside /align");
		return "home.jsp";
	}
/*
 * spring.h2.console.enabled=true
spring.datasource.platform=h2
spring.datasource.url=  jdbc:h2:~/test
debug=false
 * @RequestMapping(value="/signup",method=RequestMethod.POST) public
 * ModelAndView signup(signup sup) { ModelAndView mv = new ModelAndView();
 * System.out.println("inside sighup"); System.out.println(sup);
 * mv.setViewName("signup.jsp"); su.save(sup); return mv; }
 * 
 * @RequestMapping(value="/GetAllDetails",method=RequestMethod.GET)
 * 
 * @ResponseBody public String GetAllDetails() { ModelAndView mv = new
 * ModelAndView(); System.out.println("inside GetAllDetails"); return
 * su.findAll().toString(); }
 * 
 * @RequestMapping(value="/Details/{employeeid}", method=RequestMethod.GET)
 * 
 * @ResponseBody public String Details(@PathVariable int employeeid) {
 * ModelAndView mv = new ModelAndView(); System.out.println("inside login");
 * System.out.println(employeeid); return su.findById(employeeid).toString(); }
 * }
 * 
 */
}

