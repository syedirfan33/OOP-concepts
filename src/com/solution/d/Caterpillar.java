package com.solution.d;

public class Caterpillar extends Animal implements FlyBase{

	private FlyBase flyBase;
	private SoundBase soundBase;

	public void setFlyBase(FlyBase flyBase) {
		this.flyBase = flyBase;
	}

	public void setSoundBase(SoundBase soundBase) {
		this.soundBase = soundBase;
	}

	public void performAction(){
	  flyBase.fly();
	  soundBase.sound();
	}

	@Override
	public String fly() {
		System.out.println("Caterpillar can not fly");
		return "Caterpillar can not fly";
	}
	
	 
	
}
