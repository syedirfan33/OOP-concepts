package com.solution.a.one;

import org.junit.Before;
import org.junit.Test;

import com.solution.a.one.Bird;

/**
 * Unit test for AnimalServiceTest.
 */
public class AnimalServiceTest 

{

	private Bird bird;

	@Before
	public void init() throws Exception {
		bird = new Bird();
	}
	
	@Test
	public void testFly()
	{
		bird.fly();
	}

	@Test
	public void tesWalk()
	{
		bird.walk();
	}
}
