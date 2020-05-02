package com.teosantos.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.teosantos.course.entities.User;
import com.teosantos.course.repositories.UserRepository;
import com.teosantos.course.services.exceptions.DatabaseException;
import com.teosantos.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		try {
			userRepository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
		
	}
	
	public User update(Long id, User user) {
		User obj = userRepository.getOne(id);
		update(obj, user);
		return userRepository.save(obj);
	}

	private void update(User obj, User user) {
		obj.setName(user.getName());
		obj.setEmail(user.getEmail());
		obj.setPhone(user.getPhone());
	}
}
