package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException.*;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadSend {

	public static void main(String[] args) throws IOException {
	readdata(1, 0);
System.out.println(readdata(1, 0));

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");

     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.facebook.com/");
     
     driver.findElement(By.id("email")).sendKeys((readdata(1, 0)));
     driver.findElement(By.id("pass")).sendKeys((readdata(1, 1)));
	}

	public static String readdata(int r, int c) throws IOException {
		String path = System.getProperty("user.dir")+"\\data\\testdata.xlsx";
	
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet =  wb.getSheet("sheet2");
		
		XSSFRow row = sheet.getRow(r);
		XSSFCell cell = row.getCell(c);
		
		String val = cell.getStringCellValue();
		return val;
				
		
	}
}

