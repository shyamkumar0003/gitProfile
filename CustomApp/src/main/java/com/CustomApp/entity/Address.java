package com.CustomApp.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AddressTable")


public class Address {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)

	private long Sid;
	private String street;
	private String city;
	public long getSid() {
		return Sid;
	}
	public void setSid(long sid) {
		Sid = sid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}



}
