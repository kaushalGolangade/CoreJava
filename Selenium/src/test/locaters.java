package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaters {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Kaushal\\\\OneDrive\\\\Desktop\\\\chrome driver 2000\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//username adding
	WebElement textbox = driver.findElement(By.id("email"));
        textbox.sendKeys("kaushAL@111");
        
        //go for  password
        WebElement pass= driver.findElement(By.name("pass"));
        pass.sendKeys("buddy");
       Thread.sleep(5000);
        
        //go for eye button for showing password
      WebElement show= driver.findElement(By.className("_9lsb"));
     show.click();
       
       //click on login button
     WebElement button =  driver.findElement(By.name("login"));
      button.click();
       
       
      Thread.sleep(3000);
        
        //click on link

		WebElement link = driver.findElement(By.linkText("Forgotten account?"));
		link.click();
		
		//x path
      //absulute xpath
  //    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("gfdsyug");
      driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kaushal");

	}

}
