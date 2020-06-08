package com.zw.springbootDemo01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zw.springbootDemo01.entity.User;
import com.zw.springbootDemo01.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper ;
	
	public List<User> getAllUsers(){
		
		return userMapper.getAllUsers();
		
	}
	
}
