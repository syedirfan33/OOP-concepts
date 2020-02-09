package com.solution.a.two;

public class Bird extends Animal {
	
	@Override
	public void walk(){
		System.out.println("I am walking");
	}
	
	public void fly(){
		System.out.println("I am flying");
	}
	
	//Defining Sing method to avoid compilation error
	public void sing(){
		System.out.println("I am singing");
	}
	
	
}
