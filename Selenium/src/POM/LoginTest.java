package POM;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	public WebDriver driver;
	LoginPage lp;
	
	@BeforeClass
	public void initalization() {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe") ;
	
		
		//step-1
		driver =new ChromeDriver();
		
		//step-2
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//step-4 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));       //most imp line
		
		//create object
		 lp =new LoginPage(driver);
	
	}
	
	@Test
	public void login() {
		
		
		lp.enterCred("Admin", "admin123");
		
		Assert.assertTrue(lp.isEnabled(), "button not enabled");
		
		lp.clickButton();
		
		System.out.println("successfully login");
		
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
		
	}

}
