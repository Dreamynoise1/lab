package com.zfang.dao;

import com.zfang.entity.Role;
import com.zfang.entity.User;

public interface UserDao {
	//通过用户名查找用户
	User findUserByName(String username);
	//通过用户名和密码查找用户
	User findUserByUsernameAndPassword(String username,String password);
	//根据用户查看角色信息
	Role findRoleByUser(User user);
}
