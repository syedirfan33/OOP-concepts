package com.solution.a.four;

public class Solution {

	public static void main(String[] args) {
		Parrot parrot = new Parrot();
		parrot.setSoundBase(new DogSound());
		parrot.performSound();
		parrot.setSoundBase(new DuckSound());
		parrot.performSound();
		parrot.setSoundBase(new CatSound());
		parrot.performSound();
		parrot.setSoundBase(new RoosterSound());
		parrot.performSound();
	
	}

}
