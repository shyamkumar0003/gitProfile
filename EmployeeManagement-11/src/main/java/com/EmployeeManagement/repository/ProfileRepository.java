package com.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
