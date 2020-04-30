package com.teosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teosantos.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
