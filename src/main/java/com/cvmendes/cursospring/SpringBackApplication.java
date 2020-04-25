package com.cvmendes.cursospring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBackApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
