package com.medilabo.medilabopatientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class MedilaboPatientappApplication {

	public static void main(String[] args) {
		
		System.setProperty("spring.profiles.active","prod");
		
		SpringApplication.run(MedilaboPatientappApplication.class, args);
	}

}
