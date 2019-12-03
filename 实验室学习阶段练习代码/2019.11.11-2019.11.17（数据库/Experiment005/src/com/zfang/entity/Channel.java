package com.zfang.entity;

public class Channel {
	private Long id;
	private String profile;
	private String picUrl;
	private int type; //0:购买专区;1:交换专区;2:爱心捐赠
	private String imageName;
	/**
	 * 购买专区
	 */
	public static final int AREA_SELL =0;
	/**
	 * 交换专区
	 */
	public static final int AREA_TRADE=1;
	/**
	 * 捐赠专区
	 */
	public static final int AREA_CONTRIBUTE=2;
	
	/**
	 * 电子专区
	 */
	public static final int AREA_ELEC=3;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
}
