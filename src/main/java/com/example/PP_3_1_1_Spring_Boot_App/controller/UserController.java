package com.example.PP_3_1_1_Spring_Boot_App.controller;


import com.example.PP_3_1_1_Spring_Boot_App.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUser(Model model, Principal principal) {
        model.addAttribute("user", userService.findUserByName(principal.getName()).get());
        return "user";
    }
}
