package com.springboot.entity;

public class Greeting {
	private String uuid;
	
	public Greeting() {
		super();
	}

	public Greeting(String uuid) {
		super();
		this.uuid = uuid;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	

}
