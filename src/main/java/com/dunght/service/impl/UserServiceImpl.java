package com.dunght.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dunght.entity.User;
import com.dunght.repository.UserRepository;
import com.dunght.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUser() throws Exception {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
