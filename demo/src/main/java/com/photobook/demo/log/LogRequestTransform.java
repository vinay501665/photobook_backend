package com.photobook.demo.log;

import org.springframework.stereotype.Component;

@Component
public class LogRequestTransform {
	
	public LogEntity requestTransform(LogRequest request){
		LogEntity logEn = new LogEntity();
		logEn.setUser(request.getUser());
		return logEn;
	}

}
