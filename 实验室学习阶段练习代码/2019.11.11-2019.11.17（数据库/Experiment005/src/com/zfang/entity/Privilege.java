package com.zfang.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 权限实体（一个权限有一个父类权限和多个子权限）
 * @author 方周
 *
 */
public class Privilege {
	private Long id;
	private String name;
	private String url;
	private Privilege parent;
	private Set<Privilege> children = new HashSet<Privilege>();
	
	public Privilege(){}
	public Privilege(String name, String url, Privilege parent) {
		super();
		this.name = name;
		this.url = url;
		this.parent = parent;
	}
	public Privilege(String name, String url) {
		super();
		this.name = name;
		this.url = url;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Privilege getParent() {
		return parent;
	}
	public void setParent(Privilege parent) {
		this.parent = parent;
	}

	public Set<Privilege> getChildren() {
		return children;
	}
	public void setChildren(Set<Privilege> children) {
		this.children = children;
	}
}
