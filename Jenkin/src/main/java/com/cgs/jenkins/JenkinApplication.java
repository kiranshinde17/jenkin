package com.cgs.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(JenkinApplication.class, args);
		
		System.out.println("*********** Jenkins Application is Started ************");
	}

}
