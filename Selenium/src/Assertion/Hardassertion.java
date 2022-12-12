package Assertion;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Hardassertion {

	

	
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
	public void verifyTitle() {
		
		String exp ="Facebook – log in or sign up";
		
		String act = driver.getTitle();
		System.out.println(act);
		
		Assert.assertEquals(act, exp, "title does not matched");
		
	}
	@Test
	public void verifyButton() {
		
		String expButtonTitle ="Log in";
		
		WebElement button =driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		Assert.assertEquals(button.getText(), expButtonTitle, "Title does not match");
		
		Assert.assertTrue(button.isEnabled(), "button is not enabled");
	}
}
