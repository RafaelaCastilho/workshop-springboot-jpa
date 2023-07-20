package com.developer.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
