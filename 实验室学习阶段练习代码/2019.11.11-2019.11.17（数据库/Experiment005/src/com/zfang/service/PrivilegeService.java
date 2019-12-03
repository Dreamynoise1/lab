package com.zfang.service;

import java.util.List;

import com.zfang.entity.User;

public interface PrivilegeService {
	List<String> getAllPrivilegeUrls();
	Boolean hasPrivilegeByUrl(User user, String privUrl);
}
