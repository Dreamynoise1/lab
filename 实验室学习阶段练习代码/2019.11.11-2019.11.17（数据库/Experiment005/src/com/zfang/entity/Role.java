package com.zfang.entity;


import java.util.HashSet;
import java.util.Set;

/**
 * 用户角色实体
 * @author 方周
 *
 */
public class Role {
	private Long id;
	private String name;//角色名称
	private String description;//角色描述
	//关联属性
	private Set<Privilege> privileges= new HashSet<Privilege>();
	public Role(){}
	public Role(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Privilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}
}
