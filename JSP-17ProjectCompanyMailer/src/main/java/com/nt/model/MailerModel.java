package com.nt.model;

import java.sql.Date;

public class MailerModel {
	private Integer id;
	private String name;
	private String email;
	private String password;
	private String gender;
	private Date dob ;
	private String address;
	private String city;
	private String state;
	private String country;
	private String contact;
	private Date rdate;
	private Date authorized;
	//message
	private Integer mid;
	private String sender;
	private String receiver;
	private String suject;
	private String trash;
	private Date mdate;
	private String message;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Date getRdate() {
		return rdate;
	}
	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}
	public Date getAuthorized() {
		return authorized;
	}
	public void setAuthorized(Date authorized) {
		this.authorized = authorized;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSuject() {
		return suject;
	}
	public void setSuject(String suject) {
		this.suject = suject;
	}
	public String getTrash() {
		return trash;
	}
	public void setTrash(String trash) {
		this.trash = trash;
	}
	public Date getMdate() {
		return mdate;
	}
	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public MailerModel() {
		System.out.println("MailerModel:: 0-param contructor");
	}
	
	
}
