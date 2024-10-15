package com.example.fastAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.fastAPI.repositories.PersonaRepository;

@SpringBootApplication
public class FastApiApplication {
	private static final Logger logger = LoggerFactory.getLogger(FastApiApplication.class);

	@Autowired
	private PersonaRepository personaRepository;
	public static void main(String[] args) {
		SpringApplication.run(FastApiApplication.class, args);

		System.out.println("funcionando el proyecto");
	}
}
