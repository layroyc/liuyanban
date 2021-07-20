package com.hp.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.entity.User;
import com.hp.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	public UserService userService;
	@RequestMapping("/insert")
	public String insert(User user,HttpSession session){
		int i=userService.insert(user);
		if(i>0){
			return "redirect:/user/queryAll";
		}else{
			System.out.println("ÃÌº” ß∞‹");
			return "index";
		}

	}

	@RequestMapping("/queryAll")
	public String select(HttpSession session){
		ArrayList<User> user=userService.queryAll();
		session.setAttribute("user",user);
		return "queryAll";

	}

}
