package com.example.amsadminapi.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.amsadminapi.entity.User;
import com.example.amsadminapi.repository.UserRepository;
import com.example.amsadminapi.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userservice;

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/userinfo")
	public <T> List<User> insertUser() {
		logger.info("Inserting user data");
		return userservice.insertUsers();
	}

}
