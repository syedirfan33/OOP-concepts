package com.solution.a.two;

public class FlyWithoutWings implements FlyBase{
	
	@Override
	public String fly(){
		System.out.println("I am not flying");
		return "I am not flying";
	}

}
