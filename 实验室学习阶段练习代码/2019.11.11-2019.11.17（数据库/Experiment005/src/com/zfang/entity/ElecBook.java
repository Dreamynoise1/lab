package com.zfang.entity;

/**
 * 电子书实体
 * @author 方周
 *
 */
public class ElecBook{
	//>>一般属性
	private Long id;
	private String name;
	private String downUrl;//网盘的下载地址
	private int downCount;//下载量
	//>>关联属性
	private User user;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDownUrl() {
		return downUrl;
	}
	public void setDownUrl(String downUrl) {
		this.downUrl = downUrl;
	}
	public int getDownCount() {
		return downCount;
	}
	public void setDownCount(int downCount) {
		this.downCount = downCount;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
