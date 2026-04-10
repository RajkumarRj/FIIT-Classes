package com.example.finaljwt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;


@SpringBootApplication
public class FinaljwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinaljwtApplication.class, args);
		System.out.println("Spring boot jwt");

		Dotenv dotenv = Dotenv.load();

		System.setProperty("username", dotenv.get("usernamepirithika"));

		
	}

}
