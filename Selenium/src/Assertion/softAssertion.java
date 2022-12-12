package Assertion;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {
WebDriver driver;
	
	@BeforeClass
	public void init() throws InterruptedException {
		
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");	
		
		//step-1
		driver =new ChromeDriver();
		
		//step-2
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("https://www.facebook.com");
		
		//step-4 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	

	
	@Test 
	public void verifyURL() {
		
		String expUrl ="ww.facebook";
		
		String actUrl = driver.getCurrentUrl();
		
		//object creation
		SoftAssert sa =new SoftAssert();
		
		System.out.println("before assertion");
		
		
		sa.assertEquals(expUrl,actUrl , "URL does not matched");
		
String exp ="Facebook – log in or sign up";
		
		String act = driver.getTitle();
		System.out.println(act);
		
		sa.assertEquals(act, exp, "title does not matched");
		
		System.out.println("after assertion");
		
		sa.assertAll();
		
	}
}
