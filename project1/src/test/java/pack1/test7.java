package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class test7 {
  @Test
  public void writeExcel() throws IOException {
	  FileInputStream fis=new FileInputStream("C:\\Users\\anusha.k.m\\anusha\\excel\\test1.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet1 = wb.getSheetAt(0);  
	  
	  sheet1.getRow(0).createCell(0).setCellValue("");
	  FileOutputStream fos = new FileOutputStream("C:\\Users\\anusha.k.m\\anusha\\excel\\test1.xlsx");
	  wb.write(fos);
	
  }
}
