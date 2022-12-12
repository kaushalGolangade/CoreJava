package test;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
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
		
		js.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(2000);
		
		//step -5 find element of dropdown
		
		WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
		Thread.sleep(2000);
		//step-6 using select class to handle dropdown
		Select sel =new Select (dropdown);
		
		//select base on index
		sel.selectByIndex(1);
		Thread.sleep(2000);
		
		//select option base on visible text
		sel.selectByIndex(3);
	//	sel.selectByVisibleText("Option3");
		Thread.sleep(2000);
		
		//get all options from dropdown
//		List <WebElement> opt =sel.getOptions();
		
	//	System.out.println("Total option " + opt.size());
		Thread.sleep(2000);
		
		//use of of below method when dropdown is multi selected
		//System.out.println(sel.isMultiple());
		
	/*	for ( WebElement ele : opt) {
			
			 String name = ele.getText();
			 System.out.println(name);
			 
			 if (name.equals("Option2")) {
				 
				 sel.selectByVisibleText(name);
				 System.out.println("inside if");
				 
			 }else  {
				 
				 System.out.println("inside else");
			 }   */
		}
			
	}


