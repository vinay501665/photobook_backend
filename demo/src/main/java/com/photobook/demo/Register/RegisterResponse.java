package com.photobook.demo.Register;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class RegisterResponse {

	String userName;
	String message;
	@Override
	public String toString() {
		return "RegisterResponse [userName=" + userName + ", message=" + message + "]";
	}
	
	
}
