package groupsTestNG;

import org.testng.annotations.Test;

public class Test4 {
	
	  @Test (groups="sanity")
	  public void getTitle() {
		  
		  System.out.println(" Verify title");
	  }
	  
	  @Test (groups="integration")
	  public void verifyAccountUpdate() {
		  
		  System.out.println("update account");
		  
	  }
	  

}
