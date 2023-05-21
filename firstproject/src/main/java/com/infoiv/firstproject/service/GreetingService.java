package com.infoiv.firstproject.service;

import com.infoiv.firstproject.entity.Greeting;

import java.util.List;

public interface GreetingService {
  Greeting save(Greeting greeting);
  List<Greeting> getAllGreeting();
}
