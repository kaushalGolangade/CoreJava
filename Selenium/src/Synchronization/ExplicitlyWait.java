package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExplicitlyWait {
	
	WebDriver driver;
	
	@BeforeClass
	public void init() {
		
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
	
		
		//step-1
		driver =new ChromeDriver();
		
		//step-2
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		//step-4 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));       //web page load time duration
	}
	
	@Test
	public void handleAlert () {
		
		//click on button
		driver.findElement(By.id("alert")).click();
		
		//using explicit wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(8));      //checking time duration
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		//handling alert
		driver.switchTo().alert().accept();
		
		System.out.println("alert handled successfuly");
	
	}
	
	@AfterClass 
	public void tearDown() throws InterruptedException {
		Thread.sleep(8000);
		
		driver.close();
	}

}