package com.hospital.register;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.util.EmailFactory;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RegisterController {
	
	@Autowired
	RegisterService registerServiceObject;
	
	@Resource(name="emailFactory")
	private EmailFactory emailFactory;
	
	@RequestMapping(method = RequestMethod.GET,value = "/authentication/register")
	public List<RegisterModel> get_allRegistrationPage() {
		return registerServiceObject.show_allRegisteration();
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/authentication/register")
	public RegisterModel postRegistrationPage(@RequestBody RegisterModel obj) {
		RegisterModel savedRegisterModel=registerServiceObject.newRegisteration(obj);
//		for patient
		Email email = new Email();
		String[] to = {savedRegisterModel.getEmail()};
		email.setTo(to);
		//email.setBody();
		email.setSubject("Hospital Appointment");
		email.setFrom("youricsofttesting@gmail.com");
		Map<String, Object> model = new HashMap<>();
		model.put("title", "Appointment Scheduled");
		
		boolean emailStatus = false;
		try {
			model.put("userName", savedRegisterModel.getName());
			model.put("Date", savedRegisterModel.getDateOfAppointment());
//			emailStatus = emailFactory.sendMail(email, "/templates/appointment.vm", model);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return savedRegisterModel;
	}
	
}
