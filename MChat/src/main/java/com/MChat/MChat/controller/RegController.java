package com.MChat.MChat.controller;

import com.MChat.MChat.model.AppRepository;
import com.MChat.MChat.model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegController {

    @Autowired
    private AppRepository appRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping(value = "/req/signup", consumes = "application/json")
    public AppUser createUser(@RequestBody AppUser user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return appRepository.save(user);
    }
}
