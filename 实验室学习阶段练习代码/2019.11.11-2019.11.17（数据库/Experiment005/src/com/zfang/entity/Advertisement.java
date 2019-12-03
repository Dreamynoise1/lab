package com.zfang.entity;

import java.util.Date;

/**
 * 广告实体
 * @author 方周
 *
 */
public class Advertisement {
	private Long id;
	private String picUrl;//广告图片的存放地址
	private String url;//广告的链接地址
	private String imageName;//图片的名称
	private int position;//广告的位置
	private Date publishTime;//发表时间
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
}
