package com.madeeasy.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/")
    public String welcome(HttpServletRequest request){
        System.out.println("request = " + request.getHeader("hello"));
        return "hi from service2 being called";
    }
}
