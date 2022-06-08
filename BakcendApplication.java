package com.example.bakcend;

import com.example.bakcend.doa.ProduitRepositry;
import com.example.bakcend.entities.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BakcendApplication implements CommandLineRunner {
	@Autowired
	private ProduitRepositry produitRepositry;

	public static void main(String[] args) {
		SpringApplication.run(BakcendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		produitRepositry.save(new Products(null,"Ordinateur ",6700,3));
		produitRepositry.save(new Products(null,"Imprement ",1700,3));
		produitRepositry.save(new Products(null,"Smart Phone ",8000,13));

		produitRepositry.findAll().forEach(p ->{
			System.out.println(p.toString());
		});

	}
}
