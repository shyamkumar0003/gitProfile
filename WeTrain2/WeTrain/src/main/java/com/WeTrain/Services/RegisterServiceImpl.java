package com.WeTrain.Services;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WeTrain.Dto.RegisterDto;
//import com.WeTrain.Req.RegisterReq;
import com.WeTrain.entity.RegsiterEntity;
import com.WeTrain.repository.RegistrationRepository;

import jakarta.servlet.http.HttpServletRequest;




@Service

public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	private RegistrationRepository regiRepo;

	@Override
	public String RegisterForm(RegsiterEntity rgs) {
	
		regiRepo.save(rgs);
		return null;
	}

	@Override
	public List<RegsiterEntity> listdata() {
         
		List<RegsiterEntity> datas = regiRepo.findAll();
		return datas;
	}


//	public String Registersave(HttpServletRequest Req) {
//		
//		String response = null;
//	    try {
//			
//			RegsiterEntity  entity = new RegsiterEntity();
//				entity.setName(Req.getParameter("name"));
//				entity.setEmail(Req.getParameter("email"));
//				entity.setPhone(Req.getParameter("phone"));
//				entity.setAddress(Req.getParameter("address"));
//				entity.setCourse(Req.getParameter("course"));
//				regiRepo.save(entity);
//				response= "saved sucessfully";
//			
//			} catch(Exception e) {
//				e.printStackTrace();
//				response="failure";
//			}
//
//			return response;
//		
//		
//	}

	@Override
	public List<RegisterDto> getAllData() {
		
		List<RegsiterEntity> list = regiRepo.findAll();
		
		List<RegisterDto> dtoArray =new ArrayList<>();

		for(RegsiterEntity Data:list) {
			
			RegisterDto dto =new RegisterDto();
			dto.setId(Data.getId());
			dto.setName(Data.getName());
			dto.setEmail(Data.getEmail());
			dto.setPhone(Data.getPhone());
			dto.setAddress(Data.getAddress());
			dto.setCourse(Data.getCourse());
			
			dtoArray.add(dto);
			
		}
		return dtoArray;
	}

//	@Override
//	public String edit(HttpServletRequest request) {
//		
//		String result="";
//
//		try {		
//			RegsiterEntity entity=regiRepo.getDataById(request.getParameter("id"));
//		//entity.setId(Long.parseLong("id"));
//		//	entity.setId(request.getParamter("id"));
//			entity.setName(request.getParameter("name"));
//			entity.setPhone(request.getParameter("phone"));	
//			entity.setEmail(request.getParameter("email"));
//		    entity.setAddress(request.getParameter("address"));
//		
//			regiRepo.save(entity);
//			result="Updated Successfully";
//		} catch (Exception e) {
//			e.printStackTrace();
//			result="Exception occurred";
//		}
//		return result	;
//
//	}

	@Override
	public String deleteByName(long id) {
		
		regiRepo.deleteById(id);
		String result = "deleted successfully";
		return result;

	}

//	@Override
//	public String edit(jakarta.servlet.http.HttpServletRequest request) {
//		String result="";
//
//		try {		
//			RegsiterEntity entity=regiRepo.getDataById(request.getParameter("id"));
//		//entity.setId(Long.parseLong("id"));
//		//	entity.setId(request.getParamter("id"));
//			entity.setName(request.getParameter("name"));
//			entity.setPhone(request.getParameter("phone"));	
//			entity.setEmail(request.getParameter("email"));
//		    entity.setAddress(request.getParameter("address"));
//		
//			regiRepo.save(entity);
//			result="Updated Successfully";
//		} catch (Exception e) {
//			e.printStackTrace();
//			result="Exception occurred";
//		}
//		return result	;
//
//	}

	@Override
	public String edit(HttpServletRequest request) {
		String result="";

		try {		
			RegsiterEntity entity=regiRepo.getDataById(request.getParameter("id"));
		//entity.setId(Long.parseLong("id"));
		//	entity.setId(request.getParamter("id"));
			entity.setName(request.getParameter("name"));
			entity.setPhone(request.getParameter("phone"));	
			entity.setEmail(request.getParameter("email"));
		    entity.setAddress(request.getParameter("address"));
		    entity.setCourse(request.getParameter("course"));
		    
			regiRepo.save(entity);
			result="Updated Successfully";
		} catch (Exception e) {
			e.printStackTrace();
			result="Exception occurred";
		}
		return result	;

	}

	@Override
	public String Registersave(HttpServletRequest req) {
		String response = null;
	    try {
			
			RegsiterEntity  entity = new RegsiterEntity();
				entity.setName(req.getParameter("name"));
				entity.setEmail(req.getParameter("email"));
				entity.setPhone(req.getParameter("phone"));
				entity.setAddress(req.getParameter("address"));
				entity.setCourse(req.getParameter("course"));
				
               String img  = req.getParameter("file");
				
				String das = Base64.getEncoder().encodeToString(img.getBytes());
				
				entity.setFile(das);
		
				System.err.println(entity.getFile());
				
				regiRepo.save(entity);
				response= "saved sucessfully";
			
			} catch(Exception e) {
				e.printStackTrace();
				response="failure";
			}
		return response;
	}


}
