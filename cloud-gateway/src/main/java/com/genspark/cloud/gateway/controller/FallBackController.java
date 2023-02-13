package com.genspark.cloud.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {
    @GetMapping("/studentFallBack")
    public ResponseEntity<String> studentFallBack(){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("We are facing some problem in STUDENT Microservice. Please try later");
    }
    @GetMapping("/gradeFallBack")
    public ResponseEntity<String> gradeFallBack(){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("We are facing some problem in GRADE Microservice. Please try later");
    }
}
