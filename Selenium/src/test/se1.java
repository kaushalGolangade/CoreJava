package test;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class se1 {
	
		public static void main(String[] args) throws InterruptedException {
			
			//to set property 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
					
			//step-1 create instance of chrome driver
			WebDriver driver = new ChromeDriver();
			
			//step-2 maximize window
			driver.manage().window().maximize();
			
			//step-3 open webpage
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			//step-4 click on radio button   //by csspath
			//tagName[attributeName='attributeValue']
			driver.findElement(By.cssSelector("input[name='radio']")).click();     //by css path
			Thread.sleep(8000);
		    
		//	tagName[attributeName='attributeValue']
			driver.findElement(By.cssSelector("input[value='Radio3']")).click();
			
			//by xpath  			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"checkBoxOption3\"]")).click();
			Thread.sleep(8000);
			driver.close();
		}

	}




