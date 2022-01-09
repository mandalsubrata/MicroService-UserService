package com.user.user_service.entity;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String role;
	//@OneToMany(targetEntity = UserContact.class, mappedBy = "user",fetch = FetchType.EAGER)
	//@Column
  //  @ElementCollection(targetClass = Integer.class)
	
//	@ElementCollection
//	@CollectionTable(name = "user_contact", joinColumns = @JoinColumn(name = "contacts"))
//	@AttributeOverrides({
//		@AttributeOverride(name = "addr1", column = @Column(name = "colume_address1")),
//		@AttributeOverride(name = "addr2", column = @Column(name = "colume_address2"))
//	})
	
	@OneToMany(targetEntity = UserContact.class, cascade = CascadeType.ALL)
	//@JoinColumn
	//@JoinColumn(name = "uc_fk", referencedColumnName = "id")
	
	//@OneToMany(targetEntity=UserContact.class, mappedBy="usercontact", fetch=FetchType.EAGER)
	//private List<UserContact> contacts;
	private List<UserContact> contacts = new ArrayList<UserContact>();
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.role = contact;
	}
	

	
	public User(int id, String name, String role, List<UserContact> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.contacts = contacts;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the contact
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the contact to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	

	/**
	 * @return the contacts
	 */
	public List<UserContact> getContacts() {
		return contacts;
	}
	/**
	 * @param contacts the contacts to set
	 */
	public void setContacts(List<UserContact> contacts) {
		this.contacts = contacts;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Role=" + role + "]";
	}

	
}
