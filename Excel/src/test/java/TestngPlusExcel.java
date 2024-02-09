import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestngPlusExcel {
	
	@Test
	public void testcaseone() throws IOException {
		
		
		FileInputStream fis= new FileInputStream("C:\\Users\\yowow\\OneDrive\\Desktop\\testSheet.xlsx");
		XSSFWorkbook Workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet=Workbook.getSheet("Sample1");
		//XSSFRow ro=	sheet.getRow(0);
		
		
		
		Iterator<Row> row=sheet.rowIterator();	  
	    Row rw=  row.next();
	    int pys=rw.getPhysicalNumberOfCells();
	    
	    Iterator<Cell> cell= rw.cellIterator();
	    Cell cl=cell.next();
	    for(int i=0; i<pys;i++) {
	    	//ro.getCell(i);
	    	XSSFRow r=sheet.getRow(i);
	    	
	    	for(int j=0;j<pys;j++) {
	    		if(cl.getCellType()==CellType.STRING) {
	    			String s=r.getCell(j).getStringCellValue();
		    		System.out.println(s);
	    		}else{	    		
	    	String num=String.valueOf(r.getCell(j).getNumericCellValue());
	    	System.out.println(num);		    	
	    	}
	    	
	    	
	    	
	    	}    	
	    	//for(int j=0;j<pys;j++) {
	    	//System.out.println(ro.getCell(j));
	    	
	    	//}
	    	
	    	
	    }
	    //System.out.println(s);
	    
		
		//Iterator<Cell> cell=row.cellIterator();
		//cell.next();
	
		//System.out.println(pys);

	}

}
