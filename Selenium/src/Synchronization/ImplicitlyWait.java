package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ImplicitlyWait {
	
	public static WebDriver driver;
	
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
		
		//implicitly wait for driver context
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}

	
	@Test (priority=1)
	public void enterCred()  {
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		
	}
	
	@Test (priority=2)
	public void login() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
	}
	
	@Test (priority=3)
	public void verifytitle() {
		
		String act =driver.getTitle(); 
		
		System.out.println("Act title " + act);
		
	     Assert.assertEquals(act, "VCTC");
	}
	
	
	@AfterClass
	public void teardown() throws InterruptedException {
		
		
		
	
	}


}
