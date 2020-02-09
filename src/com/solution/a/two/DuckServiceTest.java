package com.solution.a.two;

import org.junit.Assert;
import org.junit.Test;


public class DuckServiceTest {

	@Test
	public void test(){
		Duck duck = new Duck();
		duck.setFlyBase(new FlyWithWings());
		Assert.assertEquals("I am flying",duck.performFly());

		duck.setSoundBase(new DuckSound());
		Assert.assertEquals("Quack, quack",duck.performSound());

		duck.setSwimBase(new DuckSwim());
		Assert.assertEquals("Duck swimming",duck.performSwim());

		//Chicken
		Chicken chicken = new Chicken();
		chicken.setFlyBase(new FlyWithoutWings());
		Assert.assertEquals("I am not flying",chicken.performFly());

		chicken.setSoundBase(new ChickenSound());
		Assert.assertEquals("Cluck, cluck",chicken.performSound());

		chicken.setSwimBase(new ChickenSwim());
		Assert.assertEquals("Error! Chicken can't swim",chicken.performSwim());
	}

}
