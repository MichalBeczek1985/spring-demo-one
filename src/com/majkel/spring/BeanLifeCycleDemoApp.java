package com.majkel.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load conf file
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		//retrive from bean
		Coach theCoach = ctx.getBean("myCoach", Coach.class);
		Coach alphaCoach = ctx.getBean("myCoach", Coach.class);
		
		// check if tay are the sam
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		ctx.close();
	}

}
