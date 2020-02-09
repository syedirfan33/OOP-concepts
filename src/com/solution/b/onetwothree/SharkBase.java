package com.solution.b.onetwothree;

public class SharkBase implements FishBase{

	@Override
	public String color() {
		System.out.println("Sharks are large and grey color");
		return "Sharks are large and grey color";
	}

	@Override
	public String behaviour() {
		System.out.println("Sharks eat other fish");
		return "Sharks eat other fish";
	}

}
