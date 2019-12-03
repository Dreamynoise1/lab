package com.zfang.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 宿舍区域实体
 * @author 方周
 *
 */
public class District {
	private Long id;
	private String name;
	private Set<Dormitory> dormitories = new HashSet<Dormitory>();
	
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
	
	public Set<Dormitory> getDormitories() {
		return dormitories;
	}
	public void setDormitories(Set<Dormitory> dormitories) {
		this.dormitories = dormitories;
	}
}
