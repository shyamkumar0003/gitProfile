package com.EmployeeManagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.entity.Address;



public interface AddressRepository extends JpaRepository<Address, Long> {

	

}
