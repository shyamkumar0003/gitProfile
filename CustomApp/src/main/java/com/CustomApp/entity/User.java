package com.CustomApp.entity;

import java.util.HashSet;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class User {

	@Id
	@GeneratedValue
	private long id;
	
	

	private String userName;
	
	@OneToMany(cascade = CascadeType.ALL)
	
    private List <Address> address;
	@JoinColumn(name="fk_Sid")

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	
	
	
//	@OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "my_dress_id", referencedColumnName = "id")
//   private List<Dress> dress;

	
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	
	
	
}
