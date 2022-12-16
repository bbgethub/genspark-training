package com.genspark.CareerCenter.controller;

import com.genspark.CareerCenter.controller.entity.User;
import com.genspark.CareerCenter.service.UserService;
import com.genspark.CareerCenter.service.util.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/auth/api")
@Slf4j
public class AuthController {
        @Autowired
        UserService userService;

        @Autowired
        private JwtUtil jwtUtil;

        @RequestMapping(value="/register", method=RequestMethod.POST)
        public ResponseEntity<String> register(@RequestBody User user) {
            log.info("Inside createUser in UserController");
            User userCreated = userService.createUser(user);
            System.out.println("Info saved...");
            return new ResponseEntity<String>("Registered", HttpStatus.OK);
        }
        
        @RequestMapping(value="/login", method=RequestMethod.GET)
        public ResponseEntity<String> login(@RequestBody User inputUser) {
            log.info("Inside readUsers in UserController");
            String url = "http://localhost:8081/user/api/"+inputUser.getId();
            User validateUser = new RestTemplate().getForObject(url, User.class);
            if (validateUser.getPassword().equals(inputUser.getPassword())){
                String token = jwtUtil.generateToken(validateUser.getId().toString());
                return new ResponseEntity<String>(token, HttpStatus.OK);
            }else{
                return new ResponseEntity<String>("User is not Authorized", HttpStatus.FORBIDDEN);
            }
        }


}