package com.neoteach.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterPageController {
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String registerUser()
	{
		return "register";
	}

}
