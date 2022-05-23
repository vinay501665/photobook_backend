package com.photobook.demo.Register;

import org.springframework.stereotype.Service;

@Service
public class RegisterService {
	
	private RegisterRepository repository;
	
	public RegisterResponse registerUser(RegisterRequest request) throws Exception{
		
		RegisterEntity saveResponse;
		RegisterEntity saveEntity;
		RegisterRequestTransform transorm = new RegisterRequestTransform();
		saveEntity = transorm.requestToEntity(request);
		System.out.println(saveEntity);
		saveResponse = repository.save(saveEntity);
		
		RegisterResponse response = new RegisterResponse(saveResponse.getUserName(),"User saved successfully!");
		return response;
		
	}

}
