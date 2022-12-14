package test;

import org.testng.annotations.Test;

public class Day2 {

	
	@Test
	public void Test3() 
	{
		System.out.println("Hello again!");
	}

	@Test(groups={"Smoke"})
	public void APITest4() 
	{
		System.out.println("Bye bye!!");
	
	}
}
