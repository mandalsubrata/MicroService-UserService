package com.user.user_service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class UserContact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String addr;
	private String mobile;
	
	public UserContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserContact(int id, String addr, String mobile) {
		super();
		this.id = id;
		this.addr = addr;
		this.mobile = mobile;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}
	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", addr=" + addr + ", mobile=" + mobile + "]";
	}

}
