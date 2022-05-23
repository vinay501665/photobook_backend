package com.photobook.demo.log;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class LogResponse {
	
	String response;

	@Override
	public String toString() {
		return "LogResponse [response=" + response + "]";
	}
	
	

}
