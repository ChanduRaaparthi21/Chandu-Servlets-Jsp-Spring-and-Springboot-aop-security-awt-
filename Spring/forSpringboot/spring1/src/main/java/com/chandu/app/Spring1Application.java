package com.chandu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(Spring1Application.class, args);
		
		Alien obj = context.getBean(Alien.class);
		obj.code();
		
//		
//		Alien obj1 = context.getBean(Alien.class);
//		obj1.code();
		
		
	}

}
