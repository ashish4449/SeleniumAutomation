package dataexl;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class DataRead {
public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\yowow\\OneDrive\\Desktop\\testsel.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(file);
    XSSFSheet sheet= workbook.getSheet("sheet1");
    //XSSFSheet sheet=new workbook.getSheetAt(0);
    
    int rowCount =sheet.getLastRowNum(); // we will get the row count
	
    int colCount =sheet.getRow(0).getLastCellNum();  //we will get col count/cell count
    
    for(int i=0; i<rowCount; i++) {
	XSSFRow currentrow=sheet.getRow(i);  //focus on current row
		for(int j=0; j<colCount; j++) {
		   String value=currentrow.getCell(j).toString(); // read value from string
		   System.out.print(value + " ");
		}
	System.out.println();
    }
}
}