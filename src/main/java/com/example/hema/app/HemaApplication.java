package com.example.hema.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.hema")
public class HemaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HemaApplication.class, args);
	}
}