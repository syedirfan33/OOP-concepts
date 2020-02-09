package com.solution.d;

import org.junit.Test;

public class ButterflyServiceTest {

	@Test
	public void testFishService(){
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.walk();
		caterpillar.fly();

		caterpillar.setFlyBase(new Butterfly());
		caterpillar.setSoundBase(new Butterfly());

		caterpillar.performAction();
	}
}

