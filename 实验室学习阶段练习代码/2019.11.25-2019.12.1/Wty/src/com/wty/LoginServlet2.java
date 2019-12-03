package com.wty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {

		String method = request.getMethod();
		System.out.println(method);

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		String initUser = getServletContext().getInitParameter("user");
		String initPassword = getServletContext().getInitParameter("password");

		PrintWriter out = response.getWriter();

		if (initUser.equals(username) && initPassword.equals(password)) {
			out.print("Hello: " + username);
		} else {
			out.print("Sorry: " + username);
		}

	}

}
