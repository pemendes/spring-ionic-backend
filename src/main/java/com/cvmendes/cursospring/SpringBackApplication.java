package com.cvmendes.cursospring;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cvmendes.cursospring.domain.Category;
import com.cvmendes.cursospring.repositories.CategoryRepository;

@SpringBootApplication
public class SpringBackApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Informatique");
		Category cat2 = new Category(null, "Bureautique");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));		
	}

}
