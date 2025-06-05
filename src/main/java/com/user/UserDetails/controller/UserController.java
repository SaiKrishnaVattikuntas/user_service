package com.user.UserDetails.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @GetMapping(value = "/details")
    public ResponseEntity<String> getServiceDetails(){
        return ResponseEntity.ok("Welcome to User Service ");
    }



}
