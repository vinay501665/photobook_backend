package com.photobook.demo.Register;

import org.springframework.stereotype.Component;

@Component
public class RegisterRequestTransform {
	
	public RegisterEntity requestToEntity(RegisterRequest request){
		RegisterEntity entity = new RegisterEntity();
		entity.setEmail(request.getEmail());;
		entity.setUserName(request.getUserName());
		entity.setPassword(request.getPassword());
		
		return entity;

	}

}
