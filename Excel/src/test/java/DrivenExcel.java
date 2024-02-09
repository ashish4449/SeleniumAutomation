import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DrivenExcel {

	public ArrayList<String> test(String Testcasename) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\yowow\\OneDrive\\Desktop\\testSheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int Sheetcount = workbook.getNumberOfSheets(); // to get total no. of sheets

		// started the loop to get the required sheet from the multiple sheets

		ArrayList<String> xldata = new ArrayList<String>();
		
		for (int i = 0; i < Sheetcount; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("Sample1")) { // comparing the sheet name from multiple sheets

				XSSFSheet sheet = workbook.getSheetAt(i); // get the required sheet
				Iterator<Row> row = sheet.rowIterator();

				Row Currentrow = row.next(); // get into the first row
				Iterator<Cell> cell = Currentrow.cellIterator();
				int column = 0;
				int k = 0;
				while (cell.hasNext()) {
					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcase")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);

				while (row.hasNext()) {
					Row rvalue = row.next();
					if (rvalue.getCell(column).getStringCellValue().equalsIgnoreCase(Testcasename)) {

						Iterator<Cell> cv = rvalue.cellIterator();
						while (cv.hasNext()) {

							Cell cell1 = cv.next();

							if (cell1.getCellType()==CellType.STRING) {
								xldata.add(cell1.getStringCellValue());
							} else {								
							    String ConvStringVal=String.valueOf(cell1.getNumericCellValue());
							    xldata.add(ConvStringVal);								
							}

							/*
							 * if (cell1 != null) { switch (cell1.getCellType()) { case NUMERIC: // Handle
							 * numeric value double numericValue = cell1.getNumericCellValue(); String
							 * stringvValue= String.valueOf(cell1.getNumericCellValue());
							 * xldata.add(stringvValue); System.out.println("Numeric Value: " +
							 * stringvValue); break; case STRING: // Handle string value String stringValue
							 * = cell1.getStringCellValue(); xldata.add(stringValue);
							 * System.out.println("String Value: " + stringValue); break; default: // Handle
							 * other cell types if needed System.out.println("Unsupported Cell Type"); }
							 * 
							 * }
							 */

						}

					}

				}

			}

		}
		return xldata;
	}
}
