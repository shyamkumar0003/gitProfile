package com.EmployeeManagement.entity;

import java.util.ArrayList;
import java.util.List;

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
@Table(name="employeeTable")
public class Employee {
	
	@Id
	@GeneratedValue
	
	private long e_id;
	private String e_name;
	
	
	public long getE_id() {
		return e_id;
	}
	public void setE_id(long e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	
	
	
	public Profile getProfiles() {
		return profiles;
	}
	public void setProfiles(Profile profiles) {
		this.profiles = profiles;
	}



	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="fk_profile_id")
	private Profile profiles;

	
	

	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER	)
			@JoinColumn(name = "fk_emp_id", referencedColumnName = "E_id")
	    List<Address> address = new ArrayList<>();


	
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
		

	}
	
	
	
	


