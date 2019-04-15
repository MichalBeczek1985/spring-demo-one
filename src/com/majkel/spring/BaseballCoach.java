package com.majkel.spring;

public class BaseballCoach implements Coach {
		//private field for the dependency
	private FortuneService fortuneService;
	//constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Play hard ball";
	}

	@Override
	public String getDailyFortune() {
		//use fortune service to get a fortune
		return fortuneService.getFortune();	
				
	}

}
