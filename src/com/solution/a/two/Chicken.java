package com.solution.a.two;

public class Chicken extends Bird{

	private FlyBase flyBase;
	private SoundBase soundBase;
	private SwimBase swimBase;
	
	
	public String performSound(){
		return soundBase.sound();
	}
	public String performFly(){
		return flyBase.fly();
	}
	
	public String performSwim(){
		return swimBase.swim();
	}
	
	//setters
	
	public void setFlyBase(FlyBase fly) {
		this.flyBase = fly;
	}
	public void setSoundBase(SoundBase sound) {
		this.soundBase = sound;
	}
	public void setSwimBase(SwimBase swim) {
		this.swimBase = swim;
	}
}
