package com.infoiv.firstproject.service;

import com.infoiv.firstproject.entity.Greeting;
import com.infoiv.firstproject.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService{

    @Autowired
    private GreetingRepository greetRepo;

    @Override
    public Greeting save(Greeting greeting) {
        return this.greetRepo.save(greeting);
    }

    @Override
    public List<Greeting> getAllGreeting() {
        return this.greetRepo.findAll();
    }
}
