package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class se4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		//to set property 
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
						
				//step-1 create instance of chrome driver
				WebDriver driver = new ChromeDriver();
				
				//step-2 maximize window
				driver.manage().window().maximize();
				
				//step-3 open webpage
				driver.get("https://vctcpune.com/selenium/practice.html");
				
				//step-4  scrolling
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				js.executeScript("window.scrollBy(0,500)", "");
				
				//step -5 locate button element
				Thread.sleep(8000);
				WebElement alertButton = driver.findElement(By.id("alertbtn"));
				alertButton.click();
				Thread.sleep(2000);
				
				//step -6 Handling of Alert
				
				Alert al= driver.switchTo().alert();
				
				al.accept();
				
				Thread.sleep(8000);
				driver.close();

	}

}

