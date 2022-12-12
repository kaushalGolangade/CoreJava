package TestNG;

import org.testng.annotations.Test;


import org.testng.Assert;




public class DependancyCases {
	
	 @Test (dependsOnMethods="enterCred")
	  public void button() {
		  
		  System.out.println(" button");
		  Assert.assertTrue(false);
	  }
	  
	  @Test 
	  public void enterCred() {
		  
		  System.out.println("enter cred");
		  
	  }
	  
	  @Test  (dependsOnMethods="button")
	  public void login() {
		  
		  System.out.println("login");
	  }
	

}
