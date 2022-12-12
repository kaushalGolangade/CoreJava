package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Dataprovider1 {

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
		driver.get("https://www.facebook.com/");		
		
	}
	
	@Test (dataProvider="testdata")
	public void login(String username, String pass) throws InterruptedException {
		//step-1
		WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));
		emailBox.sendKeys(username);
		Thread.sleep(1000);
		
		//step-2
		driver.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(1000);
		
		//step-3
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		
		//step-4 go back
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		//step-5 clear text
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
	}
	
	@DataProvider(name="testdata")                        //name is fix in dataProvider caz its in string	
	public  String[][] getData() {
		
		String [][] data = {{"abc@gmail.com","abc123"}, {"xyz@gmail.com", "xyz123"}, {"def@gmail.com","def123"}};
				  
		return data;
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(8000);
	//	driver.close();
	}
}