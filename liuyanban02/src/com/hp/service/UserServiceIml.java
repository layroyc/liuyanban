package com.hp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.dao.UserDao;
import com.hp.entity.User;
@Service
public class UserServiceIml implements UserService{
	//“¿¿µ◊¢»Î
	@Autowired
	public UserDao userDao;
	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		int i=userDao.add(user);
		return i;
	}
	@Override
	public ArrayList<User> queryAll() {
		// TODO Auto-generated method stub
		ArrayList<User> list=userDao.selectAll();
		return list;
	}

}
