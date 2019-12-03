package com.zfang.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zfang.entity.Role;
import com.zfang.entity.User;
import com.zfang.service.UserService;
import com.zfang.service.impl.UserServiceImpl;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	private UserService userService = new UserServiceImpl();
	private User user = new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	/**
	 * 登陆界面	
	 * @return
	 * @throws Exception
	 */
	public String loginUI() throws Exception{
		return "loginUI";
	}
	
	/**
	 * 登陆成功,记得要把user保存在session中
	 * @return
	 * @throws Exception
	 */
	public String login(){
		if(userService.findUserByUsername(user.getLoginName()) != null){
			User existUser = userService.findUserByUsernameAndPassword(user.getLoginName(), user.getPassword());
			if(existUser != null){
				ActionContext.getContext().getSession().put("user", existUser);
				//检查是否为管理员
				Role role = userService.getUserRole(existUser);
				if(role.getName().equals("admin")){
					return "toIndex";//转到admin目录下的首页
				}else{
					return "MyLibrary";//转到我的图书馆
				}
			}else{
				this.addFieldError("errorMsg", "密码不正确，请重新输入");
				return "loginUI";
			}
		}else{
			this.addFieldError("errorMsg", "用戶名不存在，请重新输入");
			return "loginUI";
		}
	}
	
	/**
	 * 注册界面	
	 * @return
	 * @throws Exception
	 */
	public String registUI() throws Exception{
		return "registUI";
	}
	
	/**
	 * 注册界面	
	 * @return
	 * @throws Exception
	 */
	public String regist() throws Exception{
		return "registUI";
	}
}
