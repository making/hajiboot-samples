package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HajibootApplication {

	@GetMapping("/")
	String hello() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HajibootApplication.class, args);
	}
}
