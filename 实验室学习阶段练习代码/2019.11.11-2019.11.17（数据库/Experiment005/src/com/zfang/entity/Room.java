package com.zfang.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 宿舍房间实体
 * @author 方周
 *
 */
public class Room {
	private Long id;
	private String name;
	private Set<Bed> beds = new HashSet<Bed>();

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

	public Set<Bed> getBeds() {
		return beds;
	}
	public void setBeds(Set<Bed> beds) {
		this.beds = beds;
	}
}
