package com.solution.a.two;

public class ChickenSound implements SoundBase {
	
	@Override
	public String sound(){
		System.out.println("Cluck, cluck");
		return "Cluck, cluck";
		
	}
}
