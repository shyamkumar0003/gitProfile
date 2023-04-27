package com.CustomApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomApp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
