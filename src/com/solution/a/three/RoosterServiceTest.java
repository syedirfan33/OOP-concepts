package com.solution.a.three;

import org.junit.Assert;
import org.junit.Test;


public class RoosterServiceTest {
	
	@Test
	public void testRoosterService(){
		Rooster rooster = new Rooster();
		rooster.setFlyBase(new FlyWithWings());
		Assert.assertEquals("I am flying",rooster.performFly());
		
		rooster.setSoundBase(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo",rooster.performSound());
		
		rooster.walk();
	}

}
