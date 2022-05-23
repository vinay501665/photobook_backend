package com.photobook.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
@ComponentScan(basePackages = "com.photobook.demo")
@CrossOrigin(origins = "*")
public class DemoApplication extends SpringBootServletInitializer{
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(DemoApplication.class);
	    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
