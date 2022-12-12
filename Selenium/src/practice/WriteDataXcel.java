package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataXcel {

	public static void main(String[] args) throws IOException {
		WrittenData(0, 0, "gand");
		System.out.println("write data sucssefully");
	}

	public static void WrittenData(int r, int c, String val) throws IOException {
		String path = System.getProperty("user.dir")+"\\Data\\testdata.xlsx"; 
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		XSSFRow row = sheet.createRow(r);
		
		XSSFCell cell = row.createCell(c);
		
		cell.setCellValue(val);
		
		FileOutputStream fos = new FileOutputStream(file);
		
		wb.write(fos);
		
		
		
	}


}
