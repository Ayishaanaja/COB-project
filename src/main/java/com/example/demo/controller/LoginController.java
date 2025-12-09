package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller

public class LoginController {



@GetMapping("/login")

public String loginPage() {

return "login"; // JSP

}



@PostMapping("/authenticate")

public String authenticate() {

// Spring Security handles the real authentication

return "redirect:/home";

}



@GetMapping("/home")

public String homePage() {

return "home";

}

}