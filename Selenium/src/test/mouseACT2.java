package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseACT2 {

	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			//to set property 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
							
					//step-1 create instance of chrome driver
					WebDriver driver = new ChromeDriver();
					
					//step-2 maximize window
					driver.manage().window().maximize();
					
					//step-3 open webpage
					driver.get("https://demoqa.com/buttons");
					
					//step-4 locate element

					WebElement button2 =driver.findElement(By.xpath("//button[text()='Right Click Me']"));
					
					//step-5 Actions class
					Actions act =new Actions (driver);
					
					//right click
					act.contextClick(button2).perform();
					
					Thread.sleep(2000);
					
					 WebElement mestext2= driver.findElement(By.id("rightClickMessage"));
				 
					 String message2 = mestext2.getText();
					
					if (message2.contains("right click")) {
						
						System.out.println("test case passed");
					}
					else {
						System.out.println("test case failed");
					}

	}

}
