package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class test1 {
	
	public static WebDriver driver;	
	
	@BeforeClass
	public void page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
		driver = new ChromeDriver();
	

		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));
				
	}
	@Test(priority = 1)
	public void data() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	}
	
	@Test(priority = 2)
	public void click() {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	} 
	
	@Test(priority = 3)
	public void tital() {
		
		String act =driver.getTitle();
		
		System.out.println("tital name is "+ act);
		 Assert.assertEquals(act, "VCTC");
		
	}
	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(10000);
		driver.close();
	}
	
	

}
