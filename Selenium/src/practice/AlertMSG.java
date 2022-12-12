package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMSG {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize()	;
		
         JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", args);
		
		String name = "kaushal";
		driver.findElement(By.id("name")).sendKeys(name);
		
		driver.findElement(By.id("alertbtn")).click();
		
		Alert al = driver.switchTo().alert();
         String msg=  al.getText();   
		System.out.println( msg);
		Thread.sleep(2000);
				
		if (msg.contains("kaushal")) {
			al.accept();
			System.out.println("text is present");
		} else {
			al.dismiss();
			System.out.println("text is not present");
		}
		
		
	}

} 
