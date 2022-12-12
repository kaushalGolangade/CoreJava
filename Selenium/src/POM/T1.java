package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T1 {
	@FindBy (xpath="//input[@name='username']")
	private WebElement userBox;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement passBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	
	public T1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void entercrd(String user,String pass) {
	
		userBox.sendKeys(user);
		passBox.sendKeys(pass);
		
	}
	
	public boolean isenable() {
		
		return loginButton.isEnabled();
		
	}
	public void button() {
		loginButton.click();
	}
}
