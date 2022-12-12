package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Readprint {



public static  String readdata(int r, int c) throws IOException {
	String path = System.getProperty("user.dir")+"\\Data\\testdata.xlsx";     //gave path
	
	File file = new File(path);                       //create file
	
	FileInputStream fis = new FileInputStream(file);   //open file or read
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);           //sheet open
	 
	XSSFSheet sheet  =  wb.getSheetAt(0);              //index sheet
	
	XSSFRow row = sheet.getRow(r);                    //row     
	
	XSSFCell cell = row.getCell(c);                   //col with respect row
	
	String val = cell.getStringCellValue();              //string val
	
	return val;
	
}
public static void main(String[] args) throws IOException {
	

	
	
	List<String> list =new ArrayList<String>();                             
	
	for( int row =0; row <3;row++) {
		
		for(int col = 0; col <2; col++) {
		list.add(readdata(row, col));
		
		
	}
	}
	System.out.println(list);
	
	for(String s: list) {
		System.out.println(s);
	}
	}
}



















