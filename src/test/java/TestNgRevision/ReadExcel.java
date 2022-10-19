package TestNgRevision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		String excelpath="C:\\Users\\pankaj.kumar\\workspace\\Seleniumsessions2022\\ExcelData\\Countrydata.xlsx";
		
		
		FileInputStream inputstream= new FileInputStream(excelpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(inputstream);
		XSSFSheet sheet=wb.getSheet("Sheet2");
		int rows=sheet.getLastRowNum();//----->rows
		int cols=sheet.getRow(1).getLastCellNum();//--cols
		
		System.out.println("Total rows:"+rows);
		for(int r=0;r<=rows;r++) {
			
			XSSFRow row=sheet.getRow(r);
			
			
			for(int c=0;c<cols;c++) {
				XSSFCell cell=row.getCell(c);
				switch(cell.getCellType()) {
				case STRING:System.out.print(cell.getStringCellValue());
				break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());
				break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());
				break;
				}
				System.out.print("||");
			}
			System.out.println();
		}
	}

}
