package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerExampleApplication.class, args);
	}

	@GetMapping(value = "/getMessage")
	public String getMessage() {
		return "WEElcome to Docker first Programe";
	}
}
