package test;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class ScreenShot {	
	 static	WebDriver driver;
	 public static void main(String[] args) throws InterruptedException, IOException {
			
			dropdownHandle();
	}
		public static  void dropdownHandle() throws InterruptedException, IOException {		
			//to set property 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
					
			//step-1 create instance of chrome driver
			 driver = new ChromeDriver();
			
			//step-2 maximize window
			driver.manage().window().maximize();
			
			//step-3 open webpage
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			//step-4  scrolling
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("window.scrollBy(0,500)", "");                     
			
			Thread.sleep(2000);
			
			//step -5 click on dropdown button
			WebElement dropdown= driver.findElement(By.id("-class-dropdownexample"));
			dropdown.click();                                 
			Thread.sleep(2000);
			
			//step-6 calling screenshot code
			captureScreen("snap2");
			Thread.sleep(8000);		
		}
		
		public static void captureScreen(String name) throws IOException {
			
		//	WebDriver driver = new ChromeDriver();
			
			//step -1 use of takeScreenShot interface
			TakesScreenshot tss= (TakesScreenshot) driver;                                      //upcasting of interface takescreenshot
			
			//step-2 calling getScreenShot
			File sourceFile =tss.getScreenshotAs(OutputType.FILE);    //screenShtot file ready (SourceFile)              
	
			//step-3 path of location where we want to store screenshot
			String path =System.getProperty("user.dir")+"\\Screenshot\\"+name+".jpg";
			
			//step -4 file class
			File destinationFile = new File (path);
	
			//step-5
			FileHandler.copy(sourceFile, destinationFile);                                    //from file 
			
			System.out.println("Screenshot capture sucessfully");
			
			
			
		}

		
	}


