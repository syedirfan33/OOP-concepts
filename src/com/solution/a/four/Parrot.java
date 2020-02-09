package com.solution.a.four;

public class Parrot {
	
	
	private SoundBase soundBase;
	
	public void setSoundBase(SoundBase soundBase) {
		this.soundBase = soundBase;
	}

	public String performSound(){
		return soundBase.sound();
	}
	

}
