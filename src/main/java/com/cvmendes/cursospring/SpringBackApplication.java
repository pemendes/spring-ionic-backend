package com.cvmendes.cursospring;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cvmendes.cursospring.domain.Category;
import com.cvmendes.cursospring.domain.Product;
import com.cvmendes.cursospring.repositories.CategoryRepository;
import com.cvmendes.cursospring.repositories.ProductRepository;

@SpringBootApplication
public class SpringBackApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Informatique");
		Category cat2 = new Category(null, "Bureautique");
		
		Product p1 = new Product(null, "Ordinateur", 350.00);
		Product p2 = new Product(null, "Imprimante", 150.00);
		Product p3 = new Product(null, "Souris", 30.00);
		
		cat1.getProductList().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProductList().addAll(Arrays.asList(p2));
		
		p1.getCategoryList().add(cat1);
		p2.getCategoryList().addAll(Arrays.asList(cat1, cat2));
		p3.getCategoryList().add(cat1);
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
	}

}
