package com.marpernas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marpernas.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
