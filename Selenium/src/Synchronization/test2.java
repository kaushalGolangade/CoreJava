package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test2 {
	
	WebDriver driver ;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		
	}
	@Test
	public void test() {
	
		
		driver.findElement(By.xpath("//*[@id=\"alert\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println("alert got susscefully");
		
		driver.switchTo().alert().accept();
		
		System.out.println("alert Handled");
		
		
	}
	
	@AfterClass
	public void end() throws InterruptedException {
		
		Thread.sleep(6000);
		driver.close();
	}
	

}











