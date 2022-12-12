package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	
	 @AfterClass
	 public void Aftercondition2() {
		  System.out.println("precondition 2 ");
	  }
  
	@BeforeSuite
	 public void precondition4() {
		  System.out.println("precondition 4 ");
	  }
	
	 @BeforeTest
	 public void precondition3() {
		  System.out.println("precondition 3 ");
	  }
	 
	@BeforeClass
	 public void precondition2() {
		  System.out.println("precondition 2 ");
	  }
	
	 @BeforeMethod
	 public void precondition1() {
		  System.out.println("precondition 1");
	  }
	 
  @Test
  public void Testcase1() {
	  System.out.println("testcase 1");
  }
  
  @AfterMethod
	 public void aftercondition1() {
		  System.out.println("precondition 1");
	  }
  
 

	 @AfterTest
	 public void Aftercondition3() {
		  System.out.println("precondition 3 ");
	  }
	 
	 @AfterSuite
	 public void Aftercondition4() {
		  System.out.println("precondition 4 ");
	  }
	 
  
}
