package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL {

	public static void main(String[] args) throws Exception {

		File src = new File(".\\ExcelData\\Countrydata.xlsx");//1.provide the excel file location

		FileInputStream fis = new FileInputStream(src);//2.add the file into inputstream

		XSSFWorkbook wb = new XSSFWorkbook(fis);//3.open the file in excel workbook
		
		XSSFSheet sheet=wb.getSheet("Sheet1");//4. open the sheet
		
		int rows=sheet.getLastRowNum();
		
		System.out.println("Total rows are:"+rows);
		int cols=sheet.getRow(1).getLastCellNum();
		System.out.println("Total cols are:"+cols);
		for(int r=0;r<=rows;r++) {
			
		XSSFRow	row=sheet.getRow(r);
			
			for(int c=0;c<cols;c++) {
				
			XSSFCell cell=row.getCell(c);
			
			switch(cell.getCellType()) {
			
			case STRING: System.out.print(cell.getStringCellValue());break;
			
			case NUMERIC: System.out.print(cell.getNumericCellValue());break;
			
			case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
			
			}
			System.out.print(" || ");
			}
			System.out.println();
		}
		String data0=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel is :"+data0);
//		
//		String data1=sheet.getRow(0).getCell(1).getStringCellValue();
//		System.out.println("Data from excel is :"+data1);
		wb.close();

	}

}
