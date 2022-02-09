package com.springboot.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.entity.Greeting;
import com.springboot.service.IGreetingService;

@Service
public class IGreetingServiceImple implements IGreetingService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public String getGreetingMessage() {
		String uri = "https://httpbin.org/uuid";
		Greeting result = restTemplate.getForObject(uri, Greeting.class);
		String ans = result.getUuid();
		return ans;
	}

}
