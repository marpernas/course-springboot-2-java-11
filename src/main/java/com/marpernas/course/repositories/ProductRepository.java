package com.marpernas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marpernas.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
