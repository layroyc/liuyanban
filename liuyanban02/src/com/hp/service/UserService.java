package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.User;

public interface UserService {
	//���
	int insert(User user);
	//ȫ��
	ArrayList<User> queryAll();

}
