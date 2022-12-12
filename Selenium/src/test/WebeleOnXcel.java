package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebeleOnXcel {

	
static double numVal ;
	
	static String val;
	
	public static String readData(int r, int c) throws IOException {
		
		//step-1 path of file
		String path = System.getProperty("user.dir")+"\\Data\\testdata.xlsx"; 
		
		//step-2 file object creation
		File file =new File(path);
		
		//step-3 create object to read file
		FileInputStream fis =new FileInputStream(file);
		
		//step-4 Creating object of XSSFWorkbook
		XSSFWorkbook wb=new XSSFWorkbook (fis);
		
		//step-5 get sheet from workbook
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//step-6 get Row
		XSSFRow row=sheet.getRow(r);
		
		//step-7 get Cell
		XSSFCell cell=row.getCell(c);
		
		CellType type = cell.getCellType();
		
		System.out.println(type);
		
		//step-8 get value base on type
	
		
		
		switch (type) { 
		
		case STRING : val = cell.getStringCellValue();
		break;
		case NUMERIC : numVal = cell.getNumericCellValue();
		val = String.valueOf(cell);
		break;    
		
		}
			
		return val;
		
	}
	
	public static void m1(String user, String pass) throws InterruptedException {
		
		
		//set path require while creating driver instance 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushal\\OneDrive\\Desktop\\chrome driver 2000\\chromedriver.exe");
				
				//step -1 create object of chrome driver
				WebDriver driver =new ChromeDriver();
				
				
				//step-2 maximize
				driver.manage().window().maximize();
				
				
				//step-3 open webpage
				driver.get("https://www.facebook.com/");
				
				//step-4 insert data
				driver.findElement(By.id("email")).sendKeys(user);
				Thread.sleep(2000);
				
				driver.findElement(By.id("pass")).sendKeys(pass);
				Thread.sleep(2000);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
	
		List<String> list =new ArrayList<String>();
		
		for (int i=0; i<=2; i++)  {
			
			
			for (int j =0; j<=1; j++ ) {
				
				System.out.println(readData(i,j));
				list.add(readData(i,j));
				
				
			}
		}
		
		Thread.sleep(2000);
		
		System.out.println("list " + list);
		
		System.out.println("first email " +  list.get(0));
		
		m1(list.get(0), list.get(1));
		
	}


}
