package com.genspark.CareerCenter.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genspark.CareerCenter.controller.entity.User;
import com.genspark.CareerCenter.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user/api")
@Slf4j
public class UserController {
        @Autowired
        UserService userService;


        @RequestMapping(value="/user", method=RequestMethod.POST)
        public User createUser(@RequestBody User user) {
            log.info("Inside createUser in UserController");
            return userService.createUser(user);
        }
        
        @RequestMapping(value="/users", method=RequestMethod.GET)
        public List<User> readUsers() {
            log.info("Inside readUsers in UserController");
            return userService.getUsers();
        }

        @RequestMapping(value="/users/{userId}", method=RequestMethod.PUT)
        public User readUsers(@PathVariable(value = "userId") Long id, @RequestBody User userDetails) {
            log.info("Inside readUsers in UserController");
            return userService.updateUser(id, userDetails);
        }

        @RequestMapping(value="/users/{userId}", method=RequestMethod.DELETE)
        public void deleteUsers(@PathVariable(value = "userId") Long id) {
            log.info("Inside deleteUsers in UserController");
            userService.deleteUser(id);
        }

}