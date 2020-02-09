package com.solution.a.four;

public class CatSound implements SoundBase{
	
	@Override
	public String sound(){
		System.out.println("Meow");
		return "Meow";
	}

}
