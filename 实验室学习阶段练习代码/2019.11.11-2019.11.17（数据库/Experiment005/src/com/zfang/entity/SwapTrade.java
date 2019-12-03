package com.zfang.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 交换记录 实体
 * @author 方周
 *
 */
public class SwapTrade {
	private Long id;
	private Date createTime;
	private int status;
	
	//关联属性,因为交易的双方有先后顺序
	private List<Book> books = new ArrayList<Book>();
	private List<User> users = new ArrayList<User>();

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
