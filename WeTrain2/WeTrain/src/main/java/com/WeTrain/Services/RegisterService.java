package com.WeTrain.Services;

import java.util.List;



import com.WeTrain.Dto.RegisterDto;
import com.WeTrain.entity.RegsiterEntity;

import jakarta.servlet.http.HttpServletRequest;



public interface RegisterService {

	public String RegisterForm(RegsiterEntity rgs);

	public List<RegsiterEntity> listdata();

	public String Registersave(HttpServletRequest req);

	public List<RegisterDto> getAllData();

	public String edit(HttpServletRequest request);

	public String deleteByName(long id);

}
