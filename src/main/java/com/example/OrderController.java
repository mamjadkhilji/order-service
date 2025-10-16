package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/hello")
    public String hello() {
    	System.out.println( "Your calling hello API from OrderController" );
        return "Hello from Order Service!";
    }
}