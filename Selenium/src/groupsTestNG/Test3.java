package groupsTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test3 {
	
	@Test (groups="sanity")
	  public void button() {
		  
		  System.out.println(" button");
	  }
	  
	  @Test (groups="integration")
	  public void homePage() {
		  
		  System.out.println("HomePage");
		  
	  }
	  
	  @Test  (groups={"sanity","integration"})
	  public void login() {
		  
		  System.out.println("login");
	  }
	  

}
