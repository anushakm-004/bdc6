package pack3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel_utility1 {
	
	
	public static Object[][] readData() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\anusha.k.m\\anusha\\excel\\test7.xlsx");
		  XSSFWorkbook wb = new XSSFWorkbook(fis);
		  XSSFSheet sheet1 = wb.getSheetAt(0);
		  int rowCount = sheet1.getPhysicalNumberOfRows();
		  XSSFRow row1 = sheet1.getRow(0);
		  int colCount = row1.getPhysicalNumberOfCells();
		  
		  Object[][] data = new Object[rowCount][colCount];
		
		  for(int i=0;i<rowCount;i++)
		  {
		   for(int j=0;j<colCount;j++)
		   {
		    if(j==7 || j==9 || j==10) {
		     data[i][j]=Integer.toString((int)sheet1.getRow(i).getCell(j).getNumericCellValue());
		    }
		    else {
		     data[i][j]=sheet1.getRow(i).getCell(j).getStringCellValue();
		    }
		    
		   }
		  }
		  return data;
	}
	
	public static Object[][] readData1() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\anusha.k.m\\anusha\\excel\\test7.xlsx");
		  XSSFWorkbook wb = new XSSFWorkbook(fis);
		  XSSFSheet sheet1 = wb.getSheetAt(0);
		  int rowCount = sheet1.getPhysicalNumberOfRows();
		  XSSFRow row1 = sheet1.getRow(0);
		  //int colCount = row1.getPhysicalNumberOfCells();
		  
		  Object[][] data = new Object[rowCount][2];
		 
		
		  for(int i=0;i<rowCount;i++) {
			 
				  data[i][0]=sheet1.getRow(i).getCell(0).getStringCellValue();
				  data[i][1]=sheet1.getRow(i).getCell(3).getStringCellValue();
				  
			  }
	  
		  return data;
	}
}
