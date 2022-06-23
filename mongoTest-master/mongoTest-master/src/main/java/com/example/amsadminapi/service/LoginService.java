package com.example.amsadminapi.service;

import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.amsadminapi.entity.User;
import com.example.amsadminapi.repository.UserRepository;
import com.example.amsadminapi.request.UserRequest;
import com.example.amsadminapi.response.UserResponse;

@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;
	@Autowired
	private ModelMapper mapper;

	public UserResponse getUserByFirstNameAndLastName(UserRequest userRequest) {
		Optional<User> userinfo = userRepository.findByFirstNameAndLastName(userRequest.getFirstName(),
				userRequest.getLastName());
		UserResponse response = new UserResponse();
		if (userinfo.isPresent()) {
			mapper.map(userinfo.get(), response);
			response.setErrorMsg("Success");
		} else {
			response.setErrorMsg("Incorrect Details");
		}
		return response;
	}
}
