package com.EmployeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.EmployeeManagement.dto.AddressDto;
import com.EmployeeManagement.dto.CommonDto;
import com.EmployeeManagement.dto.EmployeeDto;
import com.EmployeeManagement.dto.ProfileDto;
import com.EmployeeManagement.services.EmployeeService;


@Controller

public class EmployeeController {
	
	@Autowired 
	EmployeeService  employeeService;


	
//	@PostMapping("/saveProfile")
//	public ResponseEntity<?> profileSave(@RequestBody ProfileDto  profileDto){
//		
//		CommonDto response = employeeService.profileSave(profileDto);
//		
//		return new ResponseEntity<CommonDto>(response,HttpStatus.OK);
//		
//	}
//
//	@PostMapping("/saveAddress")
//	public ResponseEntity<?> addressSave(@RequestBody AddressDto addressDto){
//		
//		CommonDto response = employeeService.addressSave(addressDto);
//		
//		return ResponseEntity.ok(response);
//	}
		
	@SuppressWarnings("rawtypes")
	@PostMapping(value = "/employeeSave")
	public ResponseEntity<?> employeeSave(@RequestBody EmployeeDto employeeDto)
	{
		
		CommonDto response = employeeService.employeeSave(employeeDto);
	
	return new ResponseEntity<CommonDto>(response,HttpStatus.OK);
		//return ResponseEntity.ok(response);
	}
	
	
}













