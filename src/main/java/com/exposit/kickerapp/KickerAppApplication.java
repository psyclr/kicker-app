package com.exposit.kickerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//@EntityScan("com.exposit.kickerapp.model")
public class KickerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KickerAppApplication.class, args);
	}
}
