package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;




@Listeners(TestNG.ListenersClass.class)
public class Test3 {
	
	
  @Test 
  public void button() {
	  
	  System.out.println(" button");
	  Assert.assertFalse(true);
  }
  
  @Test 
  public void homePage() {
	  
	  System.out.println("HomePage");
	  
  }
  
  @Test  (dependsOnMethods="button")
  public void login() {
	  
	  System.out.println("login");
  }
  
 
}