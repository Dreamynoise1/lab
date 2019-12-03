package com.zfang.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 宿舍楼层实体
 * @author 方周
 *
 */
public class Floor {
	private Long id;
	private String name;
	private Set<Room> rooms = new HashSet<Room>();

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

	public Set<Room> getRooms() {
		return rooms;
	}
	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}	

}
