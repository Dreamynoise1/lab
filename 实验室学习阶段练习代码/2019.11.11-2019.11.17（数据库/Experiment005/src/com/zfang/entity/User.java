package com.zfang.entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户实体
 * @author 方周
 *
 */
public class User implements java.io.Serializable{
	private static final long serialVersionUID = -4385577944822696195L;
	//>-----一般属性
	private Long id;
	private String name;//昵称
	private String loginName;
	private String password;
	private String rePassword;//该字段不保存于数据库,用于注册
	private int age;
	private int gender; //0:未知；1：男；2：女
	private String email;
	private String phone;
	private String qq;
	private String profile; //简历
	private String picUrl;
	private String imageName;//图像的名字
	private Date birthday;
	private String ipAddr;
	private int donateCount;
	
	//>------关联属性
	private Address address;
	private Role role=new Role();
	private Long roleId;//该字段不保存于数据库
	private Set<Paper> papers= new HashSet<Paper>();
	private Set<ElecBook> elecBooks = new HashSet<ElecBook>();
	private Set<DonateOrder> donateOrders = new HashSet<DonateOrder>();
	private Set<Message> messages = new HashSet<Message>();
	private Set<Book> books = new HashSet<Book>();
	
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public Set<Message> getMessages() {
		return messages;
	}
	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}
	
	public Set<DonateOrder> getDonateOrders() {
		return donateOrders;
	}
	public void setDonateOrders(Set<DonateOrder> donateOrders) {
		this.donateOrders = donateOrders;
	}
	
	public Set<Paper> getPapers() {
		return papers;
	}
	public void setPapers(Set<Paper> papers) {
		this.papers = papers;
	}
	
	public Set<ElecBook> getElecBooks() {
		return elecBooks;
	}
	public void setElecBooks(Set<ElecBook> elecBooks) {
		this.elecBooks = elecBooks;
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
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
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
	public String getIpAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public int getDonateCount() {
		return donateCount;
	}
	public void setDonateCount(int donateCount) {
		this.donateCount = donateCount;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
