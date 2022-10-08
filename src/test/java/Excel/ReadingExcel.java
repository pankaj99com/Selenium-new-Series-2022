package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingExcel {

	public static void main(String[] args) throws IOException {

		String excelpath = ".\\ExcelData\\Countrydata.xlsx";

		FileInputStream inputstream = new FileInputStream(excelpath);

		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rows = sheet.getLastRowNum();
		
		int cols=sheet.getRow(1).getLastCellNum();
		System.out.println("Number of rows are: "+rows);
		
		System.out.println("Number of cols are: "+cols);
		
		
		for(int r=0;r<=rows;r++) {
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell cell=row.getCell(c);
				switch(cell.getCellType()) {
				
				
				case STRING: System.out.println(cell.getStringCellValue());break;
				
				case NUMERIC:System.out.println(cell.getNumericCellValue());break;
				
				case BOOLEAN: System.out.println(cell.getBooleanCellValue());break;
				}
				System.out.print("  |  ");
				
			}
			
			System.out.println("");
		}

	}

}
