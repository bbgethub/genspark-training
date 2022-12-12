package com.genspark.CareerCenter.controller;

import java.util.List;

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
@RequestMapping("/api")
public class UserController {
        @Autowired
        UserService userService;


        @RequestMapping(value="/user", method=RequestMethod.POST)
        public User createUser(@RequestBody User user) {
            return userService.createUser(user);
        }
        
        @RequestMapping(value="/users", method=RequestMethod.GET)
        public List<String> readUsers() {
            return userService.getUser();
        }

        @RequestMapping(value="/users/{userId}", method=RequestMethod.PUT)
        public User readUsers(@PathVariable(value = "userId") Long id, @RequestBody User userDetails) {
            return userService.updateRole(id, userDetails);
        }

        @RequestMapping(value="/users/{userId}", method=RequestMethod.DELETE)
        public void deleteRoles(@PathVariable(value = "userId") Long id) {
            userService.deleteRole(id);
        }

}