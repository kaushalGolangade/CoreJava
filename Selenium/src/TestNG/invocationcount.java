package TestNG;

import org.testng.annotations.Test;

public class invocationcount {
	
	
	@Test(invocationCount = 1)
	public void login() {
		System.out.println("login");
	}

	
	@Test(invocationCount = 2)
	public void button() {
		System.out.println("button");
	}

	
	
	@Test(invocationCount = 4)                        //it will add same testcase but in multiple time what we have given count number
	public void home() {
		System.out.println("home");
	}

}
