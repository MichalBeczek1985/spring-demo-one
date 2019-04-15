package com.majkel.spring;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: "+fortuneService.getFortune();
	}

	
	//add on init method
	public void doMyStartupStuff() {
		System.out.println("mthod startup stuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("mthod cleanup stuff YOYO");
	}
}
