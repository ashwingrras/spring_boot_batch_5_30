package com.example.spring_boot_batch_5_30.controller;

import com.example.spring_boot_batch_5_30.model.User;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestSecurityController
{
    @GetMapping("/")
    public String home() {
        return "home"; // Public access
    }

    @GetMapping("/home")
    public String publicHome() {
        return "home"; // Public access
    }

    @GetMapping("/user")
    public String userDashboard() {
        return "user"; // Accessible by USER and ADMIN roles
    }

    @GetMapping("/admin")
    public String adminDashboard() {
        return "admin"; // Accessible only by ADMIN role
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Custom login page
    }

    /*@PreAuthorize("hasRole('ADMIN')")
    public void deleteUser(Long userId) {
        // Delete user logic
    }*/
    /*@PostAuthorize("returnObject.owner == authentication.name")
    public User getUser(Long userId) {
        return userRepository.findById(userId).orElseThrow();
    }*/
    /*@Secured("ROLE_ADMIN")
    public void updateUser(User user) {
        // Update user logic
    }*/
}
