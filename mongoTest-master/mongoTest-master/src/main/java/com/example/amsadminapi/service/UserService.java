package com.example.amsadminapi.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.amsadminapi.controller.UserController;
import com.example.amsadminapi.entity.User;
import com.example.amsadminapi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private ModelMapper mapper;

	public List<User> insertUsers() {
		User user1 = new User(1L, "test@email.com", "testfirst","testlast","testdisplay",null, null, "L1");
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userRepository.saveAll(userList);
		return userRepository.findAll();
	}
}
