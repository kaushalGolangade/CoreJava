package practice;
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

public class screenshotssss {
		static WebDriver driver;
	    public static void main(String[]args) throws InterruptedException, IOException  {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
	    	 data();
	    	  
	    }

		public  static void data()throws InterruptedException, IOException {
			driver = new ChromeDriver();
			
			
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			JavascriptExecutor jss = (JavascriptExecutor) driver;
			jss.executeScript("window.scrollBy(0,40000)", "");                         //upto what u gave dimension
 
			WebElement ele =driver.findElement(By.id("dropdown-class-example"));
			ele.click();
			Thread.sleep(6000);
			 screensnap("snap2");
			
			
		}

		public static void screensnap(String name)throws IOException  {
		
			TakesScreenshot tss = (TakesScreenshot) driver;
			File sourceFile =tss.getScreenshotAs(OutputType.FILE);
			
			String path =System.getProperty("user.dir")+"\\Screenshot\\"+name+".jpg";
			
			File f = new File (path);
			FileHandler.copy(sourceFile, f);
			System.out.println("ss captued ");
			
			
		}
																	
	    }
