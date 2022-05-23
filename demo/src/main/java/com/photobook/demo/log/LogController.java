package com.photobook.demo.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/photobook")
public class LogController {

	@Autowired
	LogService logService;
	
	@PostMapping("/log")
	public LogResponse registerUser(LogRequest request) throws Exception{
		System.out.println("inside the controller");
		
		return logService.logUser(request);
	}
}
