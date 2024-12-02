package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DemoApplication {

	@RequestMapping("/msg")
	public String printMsg() {
		
		return "hiiii world   ";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
	}

}
