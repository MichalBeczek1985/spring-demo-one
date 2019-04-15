package com.majkel.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load config file
		ClassPathXmlApplicationContext ctx = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from container
		CricketCoach theCoach = ctx.getBean("myCricketCoach", CricketCoach.class);
		
		//call method
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		//literral value
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		//close context
		ctx.close();
	}

}
