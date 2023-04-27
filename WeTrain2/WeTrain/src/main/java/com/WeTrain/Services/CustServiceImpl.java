package com.WeTrain.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WeTrain.entity.Customer;
import com.WeTrain.repository.CustRepository;



@Service

public class CustServiceImpl implements CustService {

	@Autowired
	private CustRepository cRepo;
	
	@Override
	public String loginValidation(String name, String pass) {
		String result = "";
		

	String use =	cRepo.getUserName(name);
	
	String password		= 	cRepo.getPassword(pass);
	
	System.err.println(use);
		
	if(name.equalsIgnoreCase(use) &&pass.equalsIgnoreCase(password)){
		
		result = "login successful";
	} else {
		result = "login failed";
	}
		return result;
	}

	
	@Override
	public String signupsave(String name, String pass) {
		
		String str = null;
    try {
		if (!name.isEmpty() && !pass.isEmpty()) {

			Customer cc = new Customer();
			cc.setUsername(name);
			cc.setPassword(pass);
			cRepo.save(cc);
			str = "saved successfully";
		} 
		else {
			str = "not successful";

		}
		} catch(Exception e) {
			e.printStackTrace();
		}

		return str;

	}


	
	 
	}	



