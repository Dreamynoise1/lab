package com.zfang.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * 宿舍实体
 * @author 方周
 *
 */

public class Dormitory {
	private Long id;
	private String name;
	private Set<Area> areas = new HashSet<Area>();

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

	public Set<Area> getAreas() {
		return areas;
	}
	public void setAreas(Set<Area> areas) {
		this.areas = areas;
	}
}
