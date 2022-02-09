package com.springboot;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestTemplate;

import com.springboot.entity.Greeting;
import com.springboot.service.implementation.IGreetingServiceImple;

class MockRestCallTest {

	@Mock
    RestTemplate restTemplate;
	
	@InjectMocks
	IGreetingServiceImple greetingServiceImple;
	
	String url = "https://httpbin.org/uuid";
	
	@BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void test() {
		Greeting greet = new Greeting("2a18ab0d-107c-47bd-9d94-16711a805372");
		 when(restTemplate.getForObject(url, Greeting.class)).thenReturn(greet);
		 assertNotNull(greetingServiceImple.getGreetingMessage());
	}

}
