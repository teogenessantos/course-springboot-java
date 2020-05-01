package com.teosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teosantos.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
