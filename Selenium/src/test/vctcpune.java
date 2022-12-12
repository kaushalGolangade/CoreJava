package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vctcpune {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		WebElement show = driver.findElement(By.cssSelector("input[value='Radio1']"));
		show.click();
		WebElement username=driver.findElement(By.id("name"));
		username.sendKeys("kaushal");
		WebElement contry =driver.findElement(By.id("autocomplete"));
		contry.sendKeys("USA");
		WebElement s =driver.findElement(By.name("dropdown-class-example"));
		s.sendKeys("Option 1");
	}

}
