package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.User;

public interface UserService {
	//Ìí¼Ó
	int insert(User user);
	//È«²é
	ArrayList<User> queryAll();

}
