package com.faith.app.service;

import com.faith.app.entity.User;

public interface IUserService {
	
	//Custom Method using JPQL- in UserRepository
	public User findUserByNameAndPassword(String userName,String password);
}
