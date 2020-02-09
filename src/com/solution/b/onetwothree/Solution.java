package com.solution.b.onetwothree;

public class Solution {

	public static void main(String[] args) {
		
		Fish fish = new Shark();
		fish.sing();
		fish.swim();
		fish.walk();

		Shark s = new Shark();
		s.setFishBase(new SharkBase());
		s.getFishBehaviour();
		s.getFishColor();
		Fish clownfish = new Clownfish();
		clownfish.sing();
		clownfish.swim();
		clownfish.walk();
		
		Clownfish c = new Clownfish();
		c.setFishBase(new ClownfishBase());
		c.getFishBehaviour();
		c.getFishColor();

		SwimBase d = new Dolphin();
		d.swim();
	}

}
