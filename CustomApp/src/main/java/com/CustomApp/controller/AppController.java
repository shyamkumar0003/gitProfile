package com.CustomApp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//import com.CustomApp.dto.CommonDto;
import com.CustomApp.entity.Address;
import com.CustomApp.entity.Dress;
import com.CustomApp.entity.User;
import com.CustomApp.services.AppService;

@Controller

public class AppController {
	
	@Autowired
	private AppService serv;
	
    @PostMapping("/users")
    public ResponseEntity<User> userAll(@RequestBody User usr){
    	
    	serv.SaveUser(usr);
    	return ResponseEntity.ok(usr) ;   	
    	
    }
    
    @PostMapping("/addd")
    public ResponseEntity<Address> AddressAll(@RequestBody Address ads){
    	
    	serv.SaveAddress(ads);
    	return ResponseEntity.ok(ads) ;   	
    	
    }
    
    @PostMapping("/Dress")
    public ResponseEntity<Dress> DressAll(@RequestBody Dress drs){
    	
    	serv.SaveDress(drs);
    	return ResponseEntity.ok(drs) ;   	
    	
    }
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
}
