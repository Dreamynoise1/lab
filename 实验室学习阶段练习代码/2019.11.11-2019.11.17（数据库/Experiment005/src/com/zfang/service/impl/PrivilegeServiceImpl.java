package com.zfang.service.impl;

import java.util.Collection;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.zfang.dao.PrivilegeDao;
import com.zfang.dao.impl.PrivilegeDaoImpl;
import com.zfang.entity.Privilege;
import com.zfang.entity.User;
import com.zfang.service.PrivilegeService;

public class PrivilegeServiceImpl implements PrivilegeService{
	PrivilegeDao privilegeDao = new PrivilegeDaoImpl();
	@Override
	public List<String> getAllPrivilegeUrls() {
		return privilegeDao.getAllPrivilegeUrls();
	}
	@Override
	public Boolean hasPrivilegeByUrl(User user, String privUrl) {
		if(user == null || privUrl == null || privUrl.isEmpty()){
			return false;
		}else{
			//privUrl类似 user_addUI?name=1
			//1，对URL进行处理
			int pos = privUrl.indexOf("?");
			if(pos>-1){
				privUrl = privUrl.substring(0,pos);
			}
			//去掉UI后缀(因为保存在数据库中都没有加UI）
			if(privUrl.endsWith("UI")){
				privUrl = privUrl.substring(0,privUrl.length()-2);
			}
			//若本URL在我们的系统中根本就不存在，那么做沒有权限处理
			//TODO something
			List<String> allPrivilegeUrls= privilegeDao.getAllPrivilegeUrls();
			
			if(!allPrivilegeUrls.contains(privUrl)){
				return true;
			}else{
				List<String> allowPrivilegesUrls = privilegeDao.getUserPrivilegeUrls(user);
				for(String priv:allowPrivilegesUrls){
					if(privUrl.equals((priv))){
						return true;
					}
				}
				return false;
			}
		}
	}

}
