package com.WeTrain.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.WeTrain.Dto.RegisterDto;
import com.WeTrain.Services.CustService;
import com.WeTrain.Services.RegisterService;
//import com.WeTrain.entity.Customer;
import com.WeTrain.entity.RegsiterEntity;
import com.WeTrain.repository.RegistrationRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




@Controller

public class AppController {

	@Autowired
	private CustService cServ;
	
	@Autowired
	private RegisterService rServ;
	
	@Autowired
	private RegistrationRepository rRepo;
	
	@RequestMapping("/LearnerDetails")
	   public String newLearners()
	{
         return "LearnerDetails";
       }
	
	@GetMapping("/login")
	public String LoginForm() {
		
		return "login";
	}
	
	
	@GetMapping("/home")
	public String HOmeForm() {
		
		return "Home";
	}
	@GetMapping("/learnerPage")
	public String Learner() {
		
		return "LearnerPage";
	}
	
	@GetMapping("/register")
	public String RegisterForm(RegsiterEntity rgs) {
		//rServ.RegisterForm(rgs);
		return "Register";
	}
	
	@GetMapping("/signUp")
	public String SigninForm() {
		
		return "signUp";
	}
	
	@RequestMapping(value="/newUser",method= RequestMethod.POST)
	public ResponseEntity<String>signup(@RequestParam("username")String name,@RequestParam("password")String pass ){
	
		String result= cServ.signupsave(name,pass);
System.err.println(result);
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/loginvalidation", method = RequestMethod.GET)
	public ResponseEntity<String> logincheck(@RequestParam(name = "username") String name,
			@RequestParam(name = "password") String pass) {

		String result = cServ.loginValidation(name, pass);
		System.err.println(result);
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
	
//	@RequestMapping(value="/save",method= RequestMethod.POST)
//	public ResponseEntity<String>RegisterSave( @RequestBody RegisterDto dto){
//	
//		String result= rServ.Registersave(dto);
//System.err.println(result);
//		return new ResponseEntity<String>(result,HttpStatus.OK);
//	}
//	
	
	
	
@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView register(HttpServletRequest Req,HttpServletResponse Res) {
	
	ModelAndView mv = new ModelAndView("Register");
	String result=rServ.Registersave(Req);
	return mv;
	
}
//@RequestMapping(value ="/listAllData",method = RequestMethod.GET)
//public ModelAndView ajax(HttpServletRequest request,HttpServletResponse response) {
//	List<RegisterDto> registerDto =rServ.getAllData();
//	ModelAndView ref=new ModelAndView("ajaxTable");
//	return ref;	
//}
	



@RequestMapping(value="/ajaxTable",method= RequestMethod.GET)
public String ajaxTable()
{
	return "ajaxTable";
	
}

@RequestMapping(value ="/listAllData",method = RequestMethod.GET)
public ResponseEntity<List<RegisterDto>> getDataTable() {
List<RegisterDto> dtolist=rServ.getAllData();
return new ResponseEntity<List<RegisterDto>>(dtolist,HttpStatus.OK);	
}

	
@PostMapping(value="/update")
public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) {
	String result="";
	ModelAndView ref=null;
	result= rServ.edit(request);
	if (result.equals("Updated Successfully")) {
		ref=new ModelAndView("ajaxTable");
	}
	return ref;	
}

@RequestMapping(value ="/delete",method = RequestMethod.GET)
public ResponseEntity<String> deleteByName(@RequestParam("id") long id) {
	String result="";
	 result=rServ.deleteByName(id);
	return new ResponseEntity<String>(result,HttpStatus.OK);	
}






}
