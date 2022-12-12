package test;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
		
		//step-1 create instance of chrome driver
				WebDriver driver = new ChromeDriver();
				
				//step-2 maximize window
				driver.manage().window().maximize();
				
				//step-3 open webpage
				driver.get("https://vctcpune.com/selenium/practice.html");
				
				//step-4  scrolling
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				js.executeScript("window.scrollBy(0,800)", "");
				
				Thread.sleep(2000);
				
				//get Title -
				String title = driver.getTitle();
				System.out.println("Initial parentTab Title " + title);
				
				//step-5 using getWindow handle
				String parentTab = driver.getWindowHandle();
				
				//step -6 
				//driver.findElement(By.id("opentab")).click();
				//open new tab or window
				
				driver.switchTo().newWindow(WindowType.WINDOW);
				Thread.sleep(2000);
				
				//step -7 
				Set<String> allTabs = driver.getWindowHandles();
				
				//get no of tabs in above
				int noOfTabs = allTabs.size();
				System.out.println(noOfTabs);
				
				//step - 8 iterating
				
				for ( String s : allTabs) {
					
					System.out.println(s);
					
					if (!parentTab.equals(s)) {
						
						driver.switchTo().window(s);
						driver.navigate().to("https://jqueryui.com/datepicker/");
						System.out.println("Switched to child tab");
						String childTTabTitle = driver.getTitle();
						System.out.println("childTTabTitle " + childTTabTitle);
						
					}
					
					
				}
				
				//step -9 switch back to parent tab
				driver.switchTo().window(parentTab);
				System.out.println("Title of parent tab after switched " + driver.getTitle());
				
				
						
			}

		
		
	}


