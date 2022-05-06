package com.faith.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IUserRepository;
import com.faith.app.entity.User;

@Service
public class UserServiceImplementation implements IUserService {

	
	//Field Injection
	@Autowired
	private IUserRepository userRepository;
	
	
	@Override
	public User findUserByNameAndPassword(String userName, String password) {
		
		User user=userRepository.findUserByUsernameAndPassword(userName, password);
		//Condition Check
		if(userName.equals(user.getUserName()) && password.equals(user.getPassword())) {
			return user;
		}else {
			return null;
		}
	}

}
