package com.hp.dao;

import java.util.ArrayList;

import com.hp.entity.User;

public interface UserDao {
	//Ìí¼Ó
	int add(User user);
	//È«²é
	ArrayList<User> selectAll();

}
