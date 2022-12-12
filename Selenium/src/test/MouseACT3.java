package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseACT3 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement button3 = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		
		Actions act = new Actions(driver);
		
	    act.doubleClick(button3).perform();
	    
	    WebElement msg3 = driver.findElement(By.xpath("//*[@id=\"doubleClickMessage\"]"));
	    
	   String msg = msg3.getText();
	   
	   if(msg.contains("double click")) {
		   
		   System.out.println("testcase pass");
	   } else {
		   System.out.println("faile ");
	   }
	    
	    
	}

}
