package com.springboot.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.entity.Greeting;
import com.springboot.service.IGreetingService;

@Service
public class IGreetingServiceImple implements IGreetingService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	static String uri = "https://httpbin.org/uuid";

	@Override
	public String getGreetingMessage() {
		Greeting result = restTemplate.getForObject(uri, Greeting.class);
		String ans = result.getUuid();
		return ans;
	}

}
