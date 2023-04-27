package com.CustomApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomApp.Repository.AddressRepository;
import com.CustomApp.Repository.DressRepository;
import com.CustomApp.Repository.UserRepository;
//import com.CustomApp.dto.CommonDto;
import com.CustomApp.entity.Address;
import com.CustomApp.entity.Dress;
import com.CustomApp.entity.User;

@Service

public class ServiceImpl implements AppService {
	@Autowired
	private UserRepository uRepo;
	
	@Autowired
	private AddressRepository aRepo;
	
	@Autowired
	private DressRepository dRepo;
	

	@Override
	public void SaveUser(User usr) {
		
		uRepo.save(usr);
		
	}

	@Override
	public void SaveAddress(Address ads) {
		
		aRepo.save(ads);
		
	}

	@Override
	public void SaveDress(Dress drs) {
		
		dRepo.save(drs);
		
	}

	

	
}











