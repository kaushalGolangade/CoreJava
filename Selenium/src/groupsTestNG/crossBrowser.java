package groupsTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowser {
public WebDriver driver;
	
	@Parameters("browser")
	@BeforeSuite
	public void initalization(String browser) throws InterruptedException { 
		
		
		
		if (browser.equals("chrome")) {
			
			//set path require while creating driver instance 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
		
			
			driver =new ChromeDriver();
		}
		else if (browser.equals("edge")) {
			
						System.setProperty("webdriver.edge.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\msedgedriver.exe");
		
						driver = new EdgeDriver();
		}
		Thread.sleep(2000);
		
		
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\msedgedriver.exe");
		Thread.sleep(2000);
				
	}
	
	
	@Test
	public void getTitle() {

		
		
		String actTitle= driver.getTitle();
		
		System.out.println(actTitle);
		
	}
	
	@AfterSuite
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}

}
