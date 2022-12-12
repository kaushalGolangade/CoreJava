package groupsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class loginE2E {
	
WebDriver driver;
	
	@BeforeClass
	public void initalization() {
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
		
		//step -1 create object of chrome driver
		driver =new ChromeDriver();
		
		
		//step-2 maximize
		driver.manage().window().maximize();
		
		
		//step-3 open webpage
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}

	
	@Test
	public void enterCred() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
	}
	
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(6000);
		driver.close();
	}

  

}
