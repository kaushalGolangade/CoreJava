package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
		
		//step-1 create instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//step-2 maximize window
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//step-4  scrolling
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(2000);
		//step -5 enter value in text box
		
		String name = "Velocity";
		driver.findElement(By.cssSelector("input#name")).sendKeys(name);
		Thread.sleep(2000);
		
		//step 6 click on confirm button
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		
		//step 7 handle alert
		Alert al =driver.switchTo().alert();
		
		String alertMessage = al.getText();
         System.out.println(alertMessage);
		
	//step 8 opeartion base on text on alert
		
		if (alertMessage.contains("vedant")) {
			
			al.accept();
			System.out.println("text present on alert");
		}
		else {
			al.dismiss();
			System.out.println("text does not present on alert");
		}
			
			
	  
	}

}
