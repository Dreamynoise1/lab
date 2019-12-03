package com.zfang.service.impl;

import com.zfang.dao.UserDao;
import com.zfang.dao.impl.UserDaoImpl;
import com.zfang.entity.Role;
import com.zfang.entity.User;
import com.zfang.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao = new UserDaoImpl();
	@Override
	public User findUserByUsername(String username) {
		if(username == null){
			return null;
		}else{
			return userDao.findUserByName(username);
		}
	}
	@Override
	public User findUserByUsernameAndPassword(String username, String password) {
		if(username == null || username.isEmpty() || password == null || password.isEmpty()){
			return null;
		}else{
			return userDao.findUserByUsernameAndPassword(username, password);
		}
	}
	@Override
	public Role getUserRole(User user) {
		if(user == null){
			return null;
		}else{
			return userDao.findRoleByUser(user);
		}
	}

}
