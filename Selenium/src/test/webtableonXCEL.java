package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class webtableonXCEL {
	
		
    public static  void writedata(int r, int c,String val)throws IOException, InterruptedException  {
		
		//path of file
		
	String path = System.getProperty("user.dir")+ "\\Data\\testdata.xlsx";
		
		//file object creation
		
		File file = new File (path);
		
		//create onject to read file
		
		FileInputStream fis = new FileInputStream(file);
		
		//creating object of XSSFWorkbook
		
		XSSFWorkbook ws = new XSSFWorkbook(fis);
		
		//get sheet from workbook
		
		XSSFSheet sheet = ws.getSheet("Sheet3");
		
		//get row
		
		XSSFRow row = sheet.createRow(r);
		
		//get cell
		
		XSSFCell cell = row.createCell(c);
		
		//set value to cell
		cell.setCellValue(val);
		
		//cell.setCellValue(num);
		
		// create a object to write file
		
		FileOutputStream fos = new FileOutputStream(file);
		
		//write into file
		
		ws.write(fos);
		
		//to close workbook
		
		ws.close();
		
		System.out.println(" Data written Successfully");
		
}
		
	public static void main(String[] args) throws IOException, InterruptedException {
	
		// Get Property:-
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
		
		//Launch instant of object:- 
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window:-
		driver.manage().window().maximize();

		//Launch the web site:-
		driver.get("https://vctcpune.com/selenium/practice.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		
		//get list of webelement
		List <WebElement> list = driver.findElements(By.xpath("//table[@id=\"product\"]/tbody/tr[2]"));
		
		System.out.println(list);
		
		// itreation

		int count =0;
		int col =0;

		  for ( WebElement ele : list ) {
		  
		         String faceValue = ele.getText();
		  
		         
		          writedata(count,col, faceValue);
		          count++;
		  
		  }
	}


}

