package TestNG;

import org.testng.annotations.Test;

public class prioWiseDesc {

	
	@Test (priority = 0,description = "login the page")
	public void login() {
		System.out.println("login");
	}

	@Test(priority = -1, description = "button shoud be click")
	public void button() {
		System.out.println("button");
	}

	@Test(priority = 1, description = "home page shoud be appear")
	public void home() {                                            
		System.out.println("home");
	}
}
