package com.zfang.controller;

import com.opensymphony.xwork2.ActionSupport;

public class LibraryAction extends ActionSupport{
	public String top() throws Exception {
		return "top";
	}

	public String right() throws Exception {
		return "right";
	}
	
	public String left() throws Exception {
		return "left";
	}
	
	public String bottom() throws Exception {
		return "bottom";
	}
}
