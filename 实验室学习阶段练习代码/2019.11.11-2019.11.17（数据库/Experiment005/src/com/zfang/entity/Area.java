package com.zfang.entity;


import java.util.HashSet;
import java.util.Set;

/**
 * 宿舍区域（A/B）实体
 * @author 方周
 *
 */
public class Area {
	private Long id;
	private String name;
	private Set<Floor> floors  = new HashSet<Floor>();
	
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
	
	public Set<Floor> getFloors() {
		return floors;
	}
	public void setFloors(Set<Floor> floors) {
		this.floors = floors;
	}
}
