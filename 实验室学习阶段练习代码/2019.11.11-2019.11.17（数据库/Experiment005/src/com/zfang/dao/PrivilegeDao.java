package com.zfang.dao;

import java.util.List;

import com.zfang.entity.User;

public interface PrivilegeDao {
	List<String> getAllPrivilegeUrls();
	//获取指定用户的权限资源
	List<String> getUserPrivilegeUrls(User user);
}
