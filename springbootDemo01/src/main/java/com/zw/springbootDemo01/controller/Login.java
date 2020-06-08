package com.zw.springbootDemo01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zw.springbootDemo01.entity.User;
import com.zw.springbootDemo01.service.UserService;
import com.zw.springbootDemo01.service.UserService;

@Controller
public class Login {

	
	@Autowired 
	private UserService userService;
	 
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView model = new ModelAndView();
		model.addObject("name", "Zhang Wei Da Shuai Ge!");
		
		List<User> userList = userService.getAllUsers();
		model.addObject("userList", userList);
		model.setViewName("login/hello");
		return model;
	}
	
	/*
	 * @RequestMapping(value = "/hello",method = RequestMethod.GET) public
	 * ModelAndView hello() { ModelAndView model = new ModelAndView();
	 * model.addObject("name", "Zhang Wei Da Shuai Ge!");
	 * model.setViewName("login/hello"); return model; }
	 */
}
