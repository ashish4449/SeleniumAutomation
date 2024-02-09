package data_driven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./testdata/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Sheet1").getRow(1).getCell(1).setCellValue("ICICI");
		FileOutputStream fos= new FileOutputStream("./testdata/Testdata.xlsx");
		wb.write(fos);

	}
}
