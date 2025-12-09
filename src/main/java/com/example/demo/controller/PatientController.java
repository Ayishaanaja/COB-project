package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.PatientService;

@Controller
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService pserv;

    // Show login page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // resolves to /WEB-INF/views/login.jsp
    }

    // Handle login form submission
    @PostMapping("/authenticate")
    public String authenticateUser(@RequestParam("username") String username,
                                   @RequestParam("password") String password,
                                   Model model) {
        if ("admin".equals(username) && "admin123".equals(password)) {
            // Redirect to home page after successful login
            return "redirect:/patient/home";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }

    // Show home page after login
    @GetMapping("/home")
    public String showHomePage() {
        return "home"; // resolves to /WEB-INF/views/home.jsp
    }
}
