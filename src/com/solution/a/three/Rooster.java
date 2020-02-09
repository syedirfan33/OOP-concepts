package com.solution.a.three;


public class Rooster extends Bird{
	private SoundBase soundBase;
	private FlyBase flyBase;

	public void setSoundBase(SoundBase soundBase) {
		this.soundBase = soundBase;
	}

	public void setFlyBase(FlyBase flyBase) {
		this.flyBase = flyBase;
	}

	
	public String performSound(){
		return soundBase.sound();
	}
	
	public String performFly(){
		return flyBase.fly();
	}

}
