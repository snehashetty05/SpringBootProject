package com.springboot.service.implementation;

import org.springframework.stereotype.Service;

import com.springboot.service.IGreetingService;

@Service
public class IGreetingServiceImple implements IGreetingService {

	@Override
	public String getGreetingMessage() {
		return "Hello World!!";
	}

}
