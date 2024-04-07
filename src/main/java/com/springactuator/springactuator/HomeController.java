package com.springactuator.springactuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    public RandomEndpoint randomEndpoint;

    @GetMapping("home")
    public double home(){
        return randomEndpoint.random();
    }
}
