package com.edu.KindergartenPay.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWord")
public class helloWord {
    @GetMapping("/myFirstApi")
    public String myFirstApi() {
        return "hello world";
    }
}
