package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleProgram {

	public static void main(String[] args) throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
			
		String Actualtital = driver.getTitle();                 //getTital means what we did 
		System.out.println(Actualtital);
		
		String ExpTital = "facebook"; 
	
		if (Actualtital.equals(ExpTital)) {
			
			System.out.println("yes");
			
		}else {
			System.out.println("no");
		}
		
	}

}
