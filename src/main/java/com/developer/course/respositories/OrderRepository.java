package com.developer.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
