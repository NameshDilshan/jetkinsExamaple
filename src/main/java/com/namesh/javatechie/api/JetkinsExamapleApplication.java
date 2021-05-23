package com.namesh.javatechie.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JetkinsExamapleApplication {

	public static Logger logger  = LoggerFactory.getLogger(JetkinsExamapleApplication.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Application started !!!...");
	}
	
	public static void main(String[] args) {
		logger.info("Application executed !!!...");
		SpringApplication.run(JetkinsExamapleApplication.class, args);
	}

}
