package com.majkel.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load conf file
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive bean
		Coach theCoach = ctx.getBean("myCoach", Coach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		//close the context
		ctx.close();
	}

}
