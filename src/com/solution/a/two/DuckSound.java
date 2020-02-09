package com.solution.a.two;

public class DuckSound implements  SoundBase {
	
	@Override
	public String sound(){
		System.out.println("Quack, quack");
		return "Quack, quack";
	}
}
