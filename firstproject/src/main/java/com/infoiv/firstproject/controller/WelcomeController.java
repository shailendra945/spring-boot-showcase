package com.infoiv.firstproject.controller;

import com.infoiv.firstproject.entity.Greeting;
import com.infoiv.firstproject.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class WelcomeController {

    @Autowired
    private GreetingService greetSvc;

    @PostMapping
    public String message(Greeting greet){
        this.greetSvc.save(greet);
        return  String.format("Hello %s , welcome to firstproject app!",greet.getName());
    }
    @GetMapping("/greetings")
    public List<Greeting> greetings(){
        return  this.greetSvc.getAllGreeting();
    }


}
