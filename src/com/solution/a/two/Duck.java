package com.solution.a.two;

public class Duck extends Bird{
	
	private FlyBase flyBase;
	private SoundBase soundBase;
	private SwimBase swimBase;
	
	
	public void setSwimBase(SwimBase swimBase) {
		this.swimBase = swimBase;
	}

	public String performSound(){
		return soundBase.sound();
	}
	
	public String performFly(){
		return flyBase.fly();
	}
	
	public String performSwim(){
		return swimBase.swim();
	}
	
	public void setFlyBase(FlyBase flyBase) {
		this.flyBase = flyBase;
	}
	public void setSoundBase(SoundBase soundBase) {
		this.soundBase = soundBase;
	}
	//common behaviour for all animals 
	public void walk(){
		System.out.println("I am walking");
	}

}
