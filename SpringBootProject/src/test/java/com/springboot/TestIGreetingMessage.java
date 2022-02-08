package com.springboot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import com.springboot.service.implementation.IGreetingServiceImple;

class TestIGreetingMessage {

	IGreetingServiceImple greetingServiceImple = new IGreetingServiceImple();
	
	@Test
	void test() {
		assertEquals("Hello World!!",greetingServiceImple.getGreetingMessage());
	}

}
