package com.zfang.service;

import com.zfang.entity.Role;
import com.zfang.entity.User;

public interface UserService {
	//通过用户名查找用户
	User findUserByUsername(String username);
	//通过用户名和密码查找用户
	User findUserByUsernameAndPassword(String username,String password);
	//检查用户是否为管理员用户
	Role getUserRole(User user);
}
