package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class objtest {	
	public static void main(String [] args) throws InterruptedException  {	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();				
		//to maximize the window
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");                                                                    
		//screen stuck for 5sec
	Thread.sleep(5000);
	                                                                       
		//to navigate window
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(3000);
		
		//to return backward page 
		driver.navigate().back();
		Thread.sleep(3000);
		
		//again on return page
		driver.navigate().forward();
		Thread.sleep(5000);
		
		//to refresh the page
		driver.navigate().refresh();
		
		Thread.sleep(5000);	
	  	//to minimize the window
      	driver.manage().window().minimize();		
	}
}