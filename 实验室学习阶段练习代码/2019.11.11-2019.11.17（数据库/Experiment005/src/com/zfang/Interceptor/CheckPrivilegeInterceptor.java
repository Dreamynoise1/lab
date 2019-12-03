package com.zfang.Interceptor;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.zfang.entity.User;
import com.zfang.service.PrivilegeService;
import com.zfang.service.impl.PrivilegeServiceImpl;

public class CheckPrivilegeInterceptor extends AbstractInterceptor{
	private PrivilegeService privilegeService = new PrivilegeServiceImpl();
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//获取用户信息，及其要执行的操作
		User user=(User) invocation.getInvocationContext().getSession().get("user");
		String namespace = invocation.getProxy().getNamespace();
		String actionName = invocation.getProxy().getActionName();
		String privUrl = namespace+actionName;
		
		//一些基本的操作，不用拦截，包括游客都可以使用
		ArrayList<String> list = new ArrayList<String>();
		list.add("/news_show");
		list.add("/news_next");
		list.add("/news_previous");
		list.add("/news_more");
		list.add("/message_more");
		
		//如果没有登录
		if(user==null){
			//如果是执行 登录|注册|首页  | 浏览新闻 操作 ，就放行
			if(privUrl.startsWith("/user_loginUI") || privUrl.startsWith("/user_login") || 
			   privUrl.startsWith("/user_registUI")|| privUrl.startsWith("/user_regist") || 
			   privUrl.startsWith("/index")|| privUrl.equals("/")|| 
			   list.contains(privUrl)){
				return invocation.invoke();
			}else{
				//否则，跳转到登陆界面,loginUI配置在全局模式中
				return "loginUI";
			}
		}else{//如果已经登陆,就判断权限
			if(privilegeService.hasPrivilegeByUrl(user,privUrl)){
				return invocation.invoke();
			}
			else{
				return "noPrivilege";
			}
		}
	}
}
