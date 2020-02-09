package com.solution.b.onetwothree;

public class Clownfish extends Fish {

	private FishBase fishBase;
	
	public void setFishBase(FishBase fishBase) {
		this.fishBase = fishBase;
	}

	@Override
	public String sing() {
		System.out.println("Clownfish doesn't sing");
		return "Clownfish doesn't sing";
	}

	@Override
	public String swim() {
		System.out.println("Clownfish can swim");
		return "Clownfish can swim";
	}

	@Override
	public String walk() {
		System.out.println("Clownfish doesn't walk");
		return "Clownfish doesn't walk";
	}
	
	public String getFishColor(){
		return fishBase.color();
	}
	
	public String getFishBehaviour(){
		return fishBase.behaviour();
	}

	

}
