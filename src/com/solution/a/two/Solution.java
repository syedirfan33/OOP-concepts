package com.solution.a.two;

public class Solution {
	public static void main(String args[]){
		//Duck
		Duck duck = new Duck();
		duck.setFlyBase(new FlyWithWings());
		duck.performFly();
		
		duck.setSoundBase(new DuckSound());
		duck.performSound();
		
		duck.setSwimBase(new DuckSwim());
		duck.performSwim();
		duck.walk();
		
		//Chicken
		Chicken chicken = new Chicken();
		chicken.setFlyBase(new FlyWithoutWings());
		chicken.performFly();
		
		chicken.setSoundBase(new ChickenSound());
		chicken.performSound();
		
		chicken.setSwimBase(new ChickenSwim());
		chicken.performSwim();
		chicken.walk();
		
	}

}
