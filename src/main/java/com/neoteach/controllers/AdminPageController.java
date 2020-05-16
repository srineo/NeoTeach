package com.neoteach.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminPageController {
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String adminPage()
	{
		return "/admin";
	}

}
