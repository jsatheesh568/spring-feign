package com.demo_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class DemoController {

    @GetMapping("/name")
    public String getName(){
        return Optional.of("Play with feign").orElse("No Name Available");
    }

    @GetMapping("/address")
    public String getAddress(){
        return Optional.of("Java World").orElse("No Address Available");
    }

    @GetMapping("/status")
    public String getStatus(){
        return Optional.of("Active").orElse("No Status Available");
    }
}
