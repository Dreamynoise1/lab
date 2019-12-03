package com.wty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestAttr
 */
public class TestAttr extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		
		Object requestAttr = request.getAttribute("requestAttr");
		out.print("requestAttr: " + requestAttr);
		out.print("<br><br>");
		
		Object sessionAttr = request.getSession().getAttribute("sessionAttr");
		out.print("sessionAttr: " + sessionAttr);
		out.print("<br><br>");
		
		Object applicationAttr = getServletContext().getAttribute("applicationAttr");
		out.print("applicationAttr: " + applicationAttr);
		out.print("<br><br>");
				
	}

}
