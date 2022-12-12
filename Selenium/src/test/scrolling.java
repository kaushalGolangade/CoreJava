package test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;        //javascriprtexecuter is anather interface class thats why we are doing our code on webdriver so                
		js.executeScript("window.scrollBy(0,400)", "");                                    //window ScrollBy is it Std? => fix  need to ratta
		
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));		
		js.executeScript("arguments[0].scrollIntoView()", checkbox);
	//	checkbox.click();
		
		
		
		Thread.sleep(2000);
		
		//get all check box
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));                   //*
		
		for ( WebElement ele: checkBoxes) {		
			ele.click();			
		}		
	}
}
