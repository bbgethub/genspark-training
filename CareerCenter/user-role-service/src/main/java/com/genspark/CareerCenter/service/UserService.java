package com.genspark.CareerCenter.service;

import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genspark.CareerCenter.controller.entity.User;
import com.genspark.CareerCenter.repository.UserRepository;
@Slf4j
@Service
	public class UserService {

	        @Autowired
            UserRepository userRepository;
	        
	     // CREATE 
	        public User createUser(User user) {
	            log.info("Inside createUser of UserService");
				return userRepository.save(user);
	        }

	        // READ
	        public List<String> getUsers() {
				log.info("Inside getUser of UserService");
	            List<User> user =userRepository.findAll();
				List<String> userId=user.stream().map(id->id.getId().toString()).collect(Collectors.toList());
				return userId;
	        }


	        // DELETE
	        public void deleteUser(Long empId) {
				log.info("Inside deleteUser of UserService");
				userRepository.deleteById(empId);
	        }
	        
	     // UPDATE
	        public User updateUser(Long userId, User userDetails) {
				log.info("Inside updateUser of UserService");
	                User user = userRepository.findById(userId).get();
	                user.setPassword(userDetails.getPassword());
	                return userRepository.save(user);
	        }
	}

