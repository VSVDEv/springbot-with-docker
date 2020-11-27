package com.vsvdev.ua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbotWithDockerApplication {

	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcom to VSVDev in Docker!!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbotWithDockerApplication.class, args);
	}

}
