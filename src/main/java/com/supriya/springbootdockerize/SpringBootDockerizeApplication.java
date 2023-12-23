package com.supriya.springbootdockerize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerizeApplication {
	@GetMapping("/message")
	public String message(){
		return "Welcome to Spring Boot docker Demo!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerizeApplication.class, args);
	}

}
