package com.teosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teosantos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
