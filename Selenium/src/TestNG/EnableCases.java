package TestNG;

import org.testng.annotations.Test;

public class EnableCases {
	@Test                                      
	public void login() {
		System.out.println("login");
	}
	
	@Test  
	public void button() {
		System.out.println("button");  
	}
	
	@Test(enabled = false)                             //(enabled= false) means this testcase is in class but we doesnt want to pass.
	public void home() {
		System.out.println("home");
	}
	

}
