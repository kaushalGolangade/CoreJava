package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralleltest {
	
	
public WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void initalization(String browser) throws InterruptedException {
		
		
		//step- 1 launch instance 
		if (browser.equals("chrome")) {
			
			//set path require while creating driver instance 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
		
			
			//step-1
			driver =new ChromeDriver();
		}
		else if (browser.equals("edge")) {
			
			//set path require while creating driver instance 
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\msedgedriver.exe");
		
			//step-1
			driver = new EdgeDriver();
		}
		Thread.sleep(2000);
		
		//step-2
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
				
	}
	
	
	@Test
	public void getTitle() throws InterruptedException {

		Thread.sleep(5000);
		
		String actTitle= driver.getTitle();
		
		System.out.println(actTitle);
		
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}

}
