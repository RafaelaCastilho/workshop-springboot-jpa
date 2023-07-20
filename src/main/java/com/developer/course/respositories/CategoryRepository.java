package com.developer.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
