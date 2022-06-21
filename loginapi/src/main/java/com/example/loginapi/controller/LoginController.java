package com.example.loginapi.controller;

import com.example.loginapi.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login()
	{
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginForm(@RequestParam String userName,@RequestParam String passWord)
	{
		return loginservice.login(userName, passWord);
	}
	
	

}
