package com.solution.d;

public class Solution {
	public static void main(String args[]){

		Caterpillar caterpillar = new Caterpillar();
		caterpillar.walk();
		caterpillar.fly();
		
		caterpillar.setFlyBase(new Butterfly());
		caterpillar.setSoundBase(new Butterfly());
		
		caterpillar.performAction();
	}

}
