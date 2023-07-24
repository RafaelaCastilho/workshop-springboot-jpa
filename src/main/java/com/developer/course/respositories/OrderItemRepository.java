package com.developer.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
	
}
