package com.EmployeeManagement.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.EmployeeManagement.dto.AddressDto;
import com.EmployeeManagement.dto.CommonDto;
import com.EmployeeManagement.dto.EmployeeDto;
import com.EmployeeManagement.dto.ProfileDto;
import com.EmployeeManagement.entity.Address;
import com.EmployeeManagement.entity.Employee;
import com.EmployeeManagement.entity.Profile;
import com.EmployeeManagement.repository.AddressRepository;
import com.EmployeeManagement.repository.EmployeeRepository;
import com.EmployeeManagement.repository.ProfileRepository;
import com.EmployeeManagement.services.EmployeeService;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private ProfileRepository profileRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
//	@Override
//	public CommonDto employeeSave(EmployeeDto employeeDto) {
//
//		CommonDto response = new CommonDto();
//
//			try {
//			if(employeeDto!=null ) 
//			{
//				
//				
//				Employee employeeEntity = new Employee();
//				employeeEntity.setE_id(employeeDto.getE_id());
//				employeeEntity.setE_name(employeeDto.getE_name());
//
//				employeeRepository.save(employeeEntity);
//
//				response.setStatus("success");
//				response.setResponseData(employeeEntity);
//	
//	
//			Profile profile = new Profile();
//			ProfileDto profileDto = employeeDto.getPdto();
//			
//			profile.setP_id(profileDto.getP_id());
//			profile.setMobile(profileDto.getMobile());
//			profile.setAge(profileDto.getAge());
//			profile.setGender(profileDto.getGender());
//			
//			
//			
//			employeeDto.setProfileDto(profileDto);
//			
//			}
//			else {
//				response.setStatus("failed");
//
//			}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//
//		return response;
//	}
//
//
//
//	@Override
//	public CommonDto profileSave(ProfileDto profileDto) {
//
//		CommonDto response = new CommonDto();
//
//		try 
//		{
//			if(profileDto!=null)
//			{
//
//				Profile profileEntity = new Profile();
//				profileEntity.setP_id(profileDto.getP_id());
//				profileEntity.setAge(profileDto.getAge());
//				profileEntity.setGender(profileDto.getGender());
//				profileEntity.setMobile(profileDto.getMobile());
//
//				profileRepository.save(profileEntity);
//
//				response.setStatus("successs");
//				response.setResponseData(profileEntity);
//			}
//			else 
//			{
//				response.setStatus("error in save");
//			}
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//			return response;
//		}
//
//
//
//	@Override
//	public CommonDto addressSave(AddressDto addressDto) {
//		
//		CommonDto response = new CommonDto();
//		try
//		{
//			if(addressDto!=null)
//			{
//				
//				Address addressEntity = new Address();
//				addressEntity.setA_id(addressDto.getA_id());
//				addressEntity.setCity(addressDto.getCity());
//				addressEntity.setAddressType(addressDto.getAddressType());
//				
//				addressRepository.save(addressEntity);
//				
//				response.setStatus("success");
//				response.setResponseData(addressEntity);
//				
//			}
//			else
//			{
//				response.setStatus("error in saving");
//				
//			}
//		}
//		catch(Exception e) 
//		{
//			e.printStackTrace();
//		}
//		
//		
//		return response;
//	}
	
	
	

	@SuppressWarnings("rawtypes")
	@Override
	public CommonDto employeeSave(EmployeeDto employeeDto) {
		
		
		
			CommonDto response=new CommonDto();
			try 
			{
				if (employeeDto != null)
				{
				Employee employeeEntity =new Employee();
				employeeEntity.setE_id(employeeDto.getE_id());
				employeeEntity.setE_name(employeeDto.getE_name());
				
				   
				
				//OneToOne
				Profile profileEntity = new Profile();
				
				ProfileDto profileDto = employeeDto.getProfileDto();
				
				profileEntity.setP_id(profileDto.getP_id());
				profileEntity.setMobile((profileDto.getMobile()));
				profileEntity.setAge(profileDto.getAge());
				profileEntity.setGender(profileDto.getGender());
				
				employeeEntity.setProfiles(profileEntity);
				
				profileRepository.save(profileEntity);
			
				
				//OneToMany
				List<AddressDto> addressdto= employeeDto.getAddressDto();
				
				List<Address> addressentity = new ArrayList<Address>();
				for ( AddressDto addDto : addressdto)
				{
					Address addressEntity =new Address();
					addressEntity.setCity(addDto.getCity());
					addressEntity.setAddressType(addDto.getAddressType());
					 
					
					addressRepository.save(addressEntity);
					
					
					addressentity.add(addressEntity);
					employeeEntity.setAddress(addressentity);
					
					
				}				
                 employeeRepository.save(employeeEntity);
                 
				
				response.setResponseData(employeeEntity);
				response.setStatus("Success");
				
				
				}
				
				
				else 
				{
					response.setStatus("Fail");
				}
			}
				
			 catch (Exception e) 
			{
	e.printStackTrace();
			}
			
			
			return response;
		}
	
	}

