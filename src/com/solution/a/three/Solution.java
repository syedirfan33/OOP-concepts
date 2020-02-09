package com.solution.a.three;

public class Solution {

	public static void main(String args[]){
		Rooster rooster = new Rooster();
		rooster.setFlyBase(new FlyWithWings());
		rooster.performFly();

		rooster.setSoundBase(new RoosterSound());
		rooster.performSound();
		
		rooster.walk();

	}
}