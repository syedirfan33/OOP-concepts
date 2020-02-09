package com.solution.a.two;

public class ChickenSwim implements SwimBase{

	@Override
	public String swim() {
		System.out.println("Error! Chicken can't swim");
		return "Error! Chicken can't swim";
	}

}
