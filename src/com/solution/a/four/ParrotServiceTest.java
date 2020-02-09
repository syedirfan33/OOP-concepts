package com.solution.a.four;

import org.junit.Assert;
import org.junit.Test;


public class ParrotServiceTest {
	
	@Test
	public void testRoosterSound(){
		Parrot parrot = new Parrot();
		parrot.setSoundBase(new DogSound());
		Assert.assertEquals("Woof, woof", parrot.performSound());
		parrot.setSoundBase(new DuckSound());
		Assert.assertEquals("Quack, quack", parrot.performSound());
		parrot.setSoundBase(new CatSound());
		Assert.assertEquals("Meow", parrot.performSound());
		parrot.setSoundBase(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo", parrot.performSound());
		
	}

}
