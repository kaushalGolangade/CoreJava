package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		String actual = driver.getTitle();
        System.out.println(actual);
        
        String ExpTital = "Amazon";
        if(actual.contains(ExpTital)) {
        	
        	System.out.println("yes");
        } else {
        	System.out.println("no");
        }
	}

}
