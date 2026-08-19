package com.example.upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class UploadApplication {

	public static void main(String[] args) {

		Dotenv load = Dotenv.load();

		System.setProperty("pass", load.get("password"));
		
		SpringApplication.run(UploadApplication.class, args);
		System.out.println("Application started");
	}

}
