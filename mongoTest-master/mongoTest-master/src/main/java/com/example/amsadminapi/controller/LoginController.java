package com.example.amsadminapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.amsadminapi.request.UserRequest;
import com.example.amsadminapi.response.UserResponse;
import com.example.amsadminapi.service.LoginService;

@RestController
@RequestMapping("/")
public class LoginController {
	@Autowired
	private LoginService loginservice;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@PostMapping("/login")
	public ResponseEntity<?> getUserByFirstNameAndLastName(@RequestBody UserRequest userRequest) throws Exception {
		UserResponse response;
		logger.info("Fetching user info");
		response = loginservice.getUserByFirstNameAndLastName(userRequest);
		return ResponseEntity.ok(response);
	}
	

}
