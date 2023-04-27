package com.CustomApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomApp.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
