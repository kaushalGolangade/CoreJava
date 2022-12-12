package TestNG;

import org.testng.annotations.Test;	

public class Priority {

	@Test  (priority=3)
	public void button() {
		System.out.println("button");
	}

	@Test (priority=1)
	public void login() {
		System.out.println("login");
	}

	
	@Test (priority=2)
	public void entercredential() {
	System.out.println("entercredential");
		}
	
}

