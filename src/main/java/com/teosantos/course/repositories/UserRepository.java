package com.teosantos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teosantos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
