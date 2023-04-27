package com.CustomApp.entity;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="dressTable")

public class Dress {
	
	     @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private  Long Dressid;
	  private  String jeans;
	  private  String tShirts;
	  
	  
	 
	    public Long getDressid() {
		return Dressid;
	}

	public void setDressid(Long dressid) {
		Dressid = dressid;
	}
	public String getJeans() {
		return jeans;
	}


	public void setJeans(String jeans) {
		this.jeans = jeans;
	}
	public String gettShirts() {
		return tShirts;
	}
	public void settShirts(String tShirts) {
		this.tShirts = tShirts;
	}

}
