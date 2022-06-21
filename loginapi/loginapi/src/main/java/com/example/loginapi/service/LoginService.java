package com.example.loginapi.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
		
	public String login(String userName,String passWord)
	{
		if(userName.equals("admin")&&(passWord.equals("admin")))
				{
					return "login";
				}
		return "welcome";
	}

}
