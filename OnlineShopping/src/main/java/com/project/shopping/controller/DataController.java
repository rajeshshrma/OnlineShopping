package com.project.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.project.shopping.domain.UserLoginDetail;
import com.project.shopping.services.IDataService;

@Controller
@SessionAttributes
public class DataController {

	@Autowired
	IDataService dataService;

	@RequestMapping("loginform")
	public ModelAndView getForm() {
		return new ModelAndView("loginform");
	}

	@RequestMapping(value = "authenticate", method = RequestMethod.GET)
	public ModelAndView authenticateUser(
			@ModelAttribute("login") UserLoginDetail user) {
		// dataService.insertRow(employee);
		System.out.println(user.getEmailid());
		System.out.println(user.getPassword());
		return new ModelAndView("redirect:result");
	}
}
