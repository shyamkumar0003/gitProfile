package com.WeTrain.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Query;

import com.WeTrain.entity.Customer;

public interface CustRepository extends JpaRepository<Customer, Long> {
	
	
	
	@Query(value="select username from project.learner where username=?1",nativeQuery=true)
	String getUserName(String name);
	
	@Query(value="select password from project.learner where password=?1",nativeQuery=true)
	String getPassword(String pass);

}
