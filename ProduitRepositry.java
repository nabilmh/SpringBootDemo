package com.example.bakcend.doa;

import com.example.bakcend.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepositry extends JpaRepository<Products,Long> {
}
