package com.chandu.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

	@Autowired
	Laptop laptop;
	
	
public void code() {
	System.out.println("From Coding method");
	laptop.Compiling();
}
	
}

