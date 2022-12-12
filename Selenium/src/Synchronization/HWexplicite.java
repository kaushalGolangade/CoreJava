package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HWexplicite {
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
	public void button() {
		
		driver.findElement(By.xpath("//button[@id='populate-text']")).click();
		WebElement text = driver.findElement(By.id("h2"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));
		
		System.out.println("got text");
		
			
		
	}
	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}
