package com.teosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teosantos.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
