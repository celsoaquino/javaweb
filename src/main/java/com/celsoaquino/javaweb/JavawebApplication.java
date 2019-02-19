 package com.celsoaquino.javaweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.celsoaquino.javaweb.domain.Categoria;
import com.celsoaquino.javaweb.repositories.CategoriaRepository;

@SpringBootApplication
public class JavawebApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JavawebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática"); 
		Categoria cat2 = new Categoria(null, "Escritório");
		
	}

}
