package com.wty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LoginServlet extends GenericServlet {

	@Override
	public void init(javax.servlet.ServletConfig config) throws ServletException {
		super.init(config);
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		String method = httpServletRequest.getMethod();
		System.out.println(method); 
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		String initUser = getServletContext().getInitParameter("user");
		String initPassword = getServletContext().getInitParameter("password");

		PrintWriter out = response.getWriter();
		
		if(initUser.equals(username) && initPassword.equals(password)){
			out.print("Hello: " + username);
		}else{
			out.print("Sorry: " + username);
		}
		
		
	}

}
