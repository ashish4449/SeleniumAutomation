import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ngExcel {
	DataFormatter formatter =new DataFormatter();
	@Test(dataProvider="data1")
	public void testrun(String arg0, String arg1, String arg2) {
		System.out.println(arg0 +arg1 +arg2);
	}
	

	
	@DataProvider(name="data1")
	public Object[][] testcaseone() throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\yowow\\OneDrive\\Desktop\\testSheet.xlsx");
		XSSFWorkbook Workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = Workbook.getSheet("Sample1");
		int rowcount=sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0); 
		int colcount=row.getLastCellNum(); //get the total no of col count on the basis of one row
		
		Object[][] data= new Object[rowcount-1][colcount];
		
		for(int i=0;i<rowcount-1;i++) {
			
			row=sheet.getRow(i+1);
			
			for(int j=0;j<colcount;j++) {
			//System.out.println(row.getCell(j));
				XSSFCell cell= row.getCell(j);
				data[i][j]=formatter.formatCellValue(cell);
				
			System.out.println(data[i][j]);
			}
			
		}
		
		return data;
	}
	
}