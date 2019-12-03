package com.zfang.entity;

import java.util.Date;

/**
 * 新闻实体
 * @author 方周
 *
 */
public class News {
	/**
	 * 公告
	 */
	public static final int NEWS_AD=0;
	/**
	 * 业界动态
	 */
	public static final int NEWS_FRATERNITY=1;
	private Long id;
	private String title;    //新闻标题
	private String content;  //新闻内容->db对应的字段要为text
	private Date publishTime;//发表时间
	private int viewCount;   //阅读人数
	private int type;        //新闻类型
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
