package TestNG;

import org.testng.annotations.Test;

public class DescriptinCases {
	
	@Test (description = "login the page")
	public void login() {
		System.out.println("login");
	}

	@Test(description = "button shoud be click")
	public void button() {
		System.out.println("button");
	}

	@Test(description = "home page shoud be appear")
	public void home() {                                            
		System.out.println("home");
	}

}
