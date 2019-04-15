package com.majkel.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load conf file
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrive from bean
		Coach theCoach = ctx.getBean("myCoach", Coach.class);
		Coach alphaCoach = ctx.getBean("myCoach", Coach.class);
		
		// check if tay are the sam
		
		boolean result = (theCoach == alphaCoach);
		
		
		//print out results
		System.out.println(" same object "+result);
		System.out.println("\nMemory location for theCoach: "+theCoach);
		System.out.println("\nMemory location for alphaCoach: "+alphaCoach);
		
		ctx.close();
	}

}
