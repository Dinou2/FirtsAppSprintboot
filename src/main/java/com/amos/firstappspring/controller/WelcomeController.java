package com.amos.firstappspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping("/welcome")
    public static String welcome(){
        return "Welcome to First App Spring";
    }
}
