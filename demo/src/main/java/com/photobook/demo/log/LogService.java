package com.photobook.demo.log;

import org.springframework.stereotype.Service;

@Service
public class LogService {
	
	private LogRepository repo;
	
	public LogResponse logUser(LogRequest req){
		LogEntity response;
		LogEntity entity;
		LogRequestTransform transform = new LogRequestTransform();
		entity = transform.requestTransform(req);
		response = repo.save(entity);
		
		LogResponse res = new LogResponse("Log saved");
		return res;
		
	}

}
