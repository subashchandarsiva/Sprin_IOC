package com.session_one.sprig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppspring {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("MyCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		
		context.close();
	}

}


