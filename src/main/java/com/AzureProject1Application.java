package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(AzureProject1Application.class, args);
	}
	
	@GetMapping("/hi")
	public String get() {
		return "application working fine!";
	}

}
