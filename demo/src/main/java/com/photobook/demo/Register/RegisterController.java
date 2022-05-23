package com.photobook.demo.Register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/photobook")
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
	@PostMapping("/user")
	public RegisterResponse registerUser(RegisterRequest registerRequest) throws Exception{
		System.out.println("inside the controller");
		
		return registerService.registerUser(registerRequest);
	}

}
