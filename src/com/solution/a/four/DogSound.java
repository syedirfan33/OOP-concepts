package com.solution.a.four;

public class DogSound implements SoundBase {
	
	@Override
	public String sound(){
		System.out.println("Woof, woof");
		return "Woof, woof";
	}
}
