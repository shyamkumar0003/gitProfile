package com.CustomApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomApp.entity.Dress;

public interface DressRepository extends JpaRepository<Dress, Long> {

}
