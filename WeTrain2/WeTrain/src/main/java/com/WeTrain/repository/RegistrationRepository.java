package com.WeTrain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.WeTrain.entity.RegsiterEntity;


public interface RegistrationRepository extends JpaRepository<RegsiterEntity, Long> {
	
	
	@Query(value="select * from register_table where id=?1",nativeQuery=true)
	RegsiterEntity getDataById(String id);

	@Query(value="select * from register_table where id=?1",nativeQuery=true)
	long getIdByName(String name);
}
