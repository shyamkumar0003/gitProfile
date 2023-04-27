package com.EmployeeManagement.dto;

import java.util.List;

public class EmployeeDto {
	
	
	private long e_id;
	private String e_name;
	
	
	private ProfileDto profileDto;
	
	private List<AddressDto> addressDto;
	

	public Long getE_id() {
		return e_id;
	}

	public void setE_id(Long e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public ProfileDto getProfileDto() {
		return profileDto;
	}

	public void setProfileDto(ProfileDto profileDto) {
		this.profileDto = profileDto;
	}

	public List<AddressDto> getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(List<AddressDto> addressDto) {
		this.addressDto = addressDto;
	}



		
	
	

}

	
	
	
	
	
	
	
	
	


