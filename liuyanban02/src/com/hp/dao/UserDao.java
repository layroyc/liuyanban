package com.hp.dao;

import java.util.ArrayList;

import com.hp.entity.User;

public interface UserDao {
	//���
	int add(User user);
	//ȫ��
	ArrayList<User> selectAll();

}
