package pract;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class driven {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\yowow\\OneDrive\\Desktop\\testsel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		int totalRow=sheet.getLastRowNum();
		int totalCol=sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<totalRow; i++) {
			XSSFRow focus= sheet.getRow(i);
			for(int j=0; j<totalCol; j++) {
				String value= focus.getCell(j).toString();
				System.out.print(" "+ value + "  ");
			}
			System.out.println();
		}
		
	}
	
}
