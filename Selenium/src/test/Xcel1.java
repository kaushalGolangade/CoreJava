package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xcel1 {

	
	public static String readData(int r, int c)throws IOException {
		
		//step-1 path of file
		String path = System.getProperty("user.dir")+ "\\Data\\testdata.xlsx";
		
		//step-2 file object creation
		File file =new File(path);
		
		//step-3 create object to read file
		FileInputStream fis =new FileInputStream(file);
		
		//step-4 Creating object of XSSFWorkbook
		XSSFWorkbook wb=new XSSFWorkbook (fis);
		
		//step-5 get sheet from workbook
		XSSFSheet sheet = wb.getSheet("Sheet2");
		
		//step-6 get Row
		XSSFRow row=sheet.getRow(r);
		
		//step-7 get Cell
		XSSFCell cell=row.getCell(c);
		
		//step-8 get value
		String val = cell.getStringCellValue();
		return val;
				
	}

     

	public static void main(String[] args) throws IOException, InterruptedException {
	
System.out.println(readData(1,1));
		
 	   System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Kaushal\\\\OneDrive\\\\Desktop\\\\chrome driver 2000\\\\chromedriver.exe");
 	   
 	   WebDriver driver = new ChromeDriver();
 	   
 	  driver.get("https://www.facebook.com/");
 	  
 	   driver.findElement(By.id("email")).sendKeys(readData(2,1));
		
 	  driver.findElement(By.id("pass")).sendKeys(readData(0,0));

	}
}

