package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uptoxpathREV {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		//find elements
		WebElement showtext =driver.findElement(By.name("email"));                                // 1]
		showtext.sendKeys("kaushal@123");		
		//find elements
  //    List<WebElement> elements=driver.findElements(By.tagName("button"));	                //   2]	
  //	System.out.println(elements.size());//---->1		
  //	for (WebElement ele:elements) {			
  //	String text = ele.getText();
		
  //		System.out.println(text);//-------> Log In		
  //	WebElement textBox=driver.findElement(By.id("pass"));                                    //   3]
  //	textBox.sendKeys("abc@gmail");
				//	 WebElement seePass = driver.findElement(By.className("_9lsb"));                     //   4]
				//	 seePass.click();
					// WebElement button = driver.findElement(By.name("login"));                              
					//	button.click();				
						//link text
					//	WebElement link = driver.findElement(By.linkText("Forgotten account?"));          //      5]
					//	link.click();
		//partial link text
				//		WebElement lnk = driver.findElement(By.partialLinkText("account?"));                //    6]
					//	lnk.click();
				
				
				//csspath
				
				driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("123654");                        //7]
				
				//xpath
				//driver.findElement(By.xpath("//button[text()='Log In']")).click();                         //8]
				}
				
			
					
					
				
			}


