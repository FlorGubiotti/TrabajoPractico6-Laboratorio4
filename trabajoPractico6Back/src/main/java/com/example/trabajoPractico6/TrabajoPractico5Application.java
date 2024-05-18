package com.example.trabajoPractico6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrabajoPractico5Application {

	private static final Logger logger = LoggerFactory.getLogger(TrabajoPractico5Application.class);


	public static void main(String[] args) {
		SpringApplication.run(TrabajoPractico5Application.class, args);
	}

	@Bean
	CommandLineRunner init(){
		return args -> {
			logger.info("Iniciando ...");
		};
	}


}
