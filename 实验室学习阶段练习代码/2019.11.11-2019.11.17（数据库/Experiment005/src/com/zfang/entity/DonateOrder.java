package com.zfang.entity;

import java.util.Date;

/**
 * 捐赠记录 实体（TODO 这个到底需要不需要常量来表示status的值）
 * @author 方周
 *
 */
public class DonateOrder {
	//>一般属性
	private Long id;
	private String title;
	private Date createTime;
	private int status;//状态：审核，成功，失败
	private String orderId;
	//关联属性
	private User user;
	
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
