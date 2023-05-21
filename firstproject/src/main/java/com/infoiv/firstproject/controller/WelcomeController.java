package com.infoiv.firstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class WelcomeController {

    @GetMapping("/{name}")
    public String message(@PathVariable String name){
        return  String.format("Hello %s , welcome to firstproject app!",name);
    }


}
