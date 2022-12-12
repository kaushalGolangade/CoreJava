package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class T2 {

	static WebDriver driver;
	T1 lpp ;
	
	@BeforeClass
	public void login () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe") ;
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
		 Thread.sleep(10000);
		 
		lpp = new T1 (driver);
		
	
	}
	
	@Test
	public void opration() {
		
		lpp.entercrd("Admin","admin123");
		
		lpp.button();
		System.out.println("successfully login");
	}
	@AfterClass
	public void tearDown() {
		
		
		
	}
}
