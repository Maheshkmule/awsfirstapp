package com.awsexample.demo12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo12Application {
	
	@GetMapping("/message")
	public String message() {
		return "Congratulation your application deployed successfully";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo12Application.class, args);
	}

}
