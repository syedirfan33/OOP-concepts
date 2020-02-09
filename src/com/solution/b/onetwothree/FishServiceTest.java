package com.solution.b.onetwothree;

import org.junit.Assert;
import org.junit.Test;


public class FishServiceTest {
	
	@Test
	public void testFishService(){
		Fish shark = new Shark();
		Assert.assertEquals("Sharks don't sing", shark.sing());
		Assert.assertEquals("Sharks can swim",shark.swim());
		Assert.assertEquals("Sharks don't walk",shark.walk());

		Shark s = new Shark();
		s.setFishBase(new SharkBase());
		s.getFishBehaviour();
		Assert.assertEquals("Sharks are large and grey color",s.getFishColor());
		
		Fish clownfish = new Clownfish();
		Assert.assertEquals("Clownfish doesn't sing",clownfish.sing());
		Assert.assertEquals("Clownfish can swim",clownfish.swim());
		Assert.assertEquals("Clownfish doesn't walk",clownfish.walk());
		
		Clownfish c = new Clownfish();
		c.setFishBase(new ClownfishBase());
		Assert.assertEquals("Clownfish make jokes",c.getFishBehaviour());
		Assert.assertEquals("Clownfish are small and colorful",c.getFishColor());

		SwimBase d = new Dolphin();
		Assert.assertEquals("Dolphins are good swimmers",d.swim());
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
