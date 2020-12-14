package com.example.hikingApp.controller;

import com.example.hikingApp.exception.ResourceNotFoundException;
import com.example.hikingApp.model.User;
import com.example.hikingApp.repository.UserRepository;
import com.example.hikingApp.security.CurrentUser;
import com.example.hikingApp.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//The UserController class contains a protected API to get the details of the currently authenticated user

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
