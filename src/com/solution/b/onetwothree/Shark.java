package com.solution.b.onetwothree;

public class Shark extends Fish{
	
private FishBase fishBase;
	
	public void setFishBase(FishBase fishBase) {
		this.fishBase = fishBase;
	}

	@Override
	public String sing() {
		System.out.println("Sharks don't sing");
		return "Sharks don't sing";
	}

	@Override
	public String swim() {
		System.out.println("Sharks can swim");
		return "Sharks can swim";
	}

	@Override
	public String walk() {
		System.out.println("Sharks don't walk");
		return "Sharks don't walk";
	}
	
	public String getFishColor(){
		return fishBase.color();
	}
	
	public String getFishBehaviour(){
		return fishBase.behaviour();
	}

}
