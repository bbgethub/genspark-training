package com.genspark.CareerCenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genspark.CareerCenter.controller.entity.User;
import com.genspark.CareerCenter.repository.UserRepository;

@Service
	public class UserService {

	        @Autowired
            UserRepository userRepository;
	        
	     // CREATE 
	        public User createUser(User emp) {
	            return userRepository.save(emp);
	        }

	        // READ
	        public List<User> getUser() {
	            return userRepository.findAll();
	        }

	        // DELETE
	        public void deleteRole(Long empId) {
	            userRepository.deleteById(empId);
	        }
	        
	     // UPDATE
	        public User updateRole(Long userId, User userDetails) {
	                User user = userRepository.findById(userId).get();
	                user.setPassword(userDetails.getPassword());
	                return userRepository.save(user);
	        }
	}

