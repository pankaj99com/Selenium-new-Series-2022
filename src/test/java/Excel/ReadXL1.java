package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL1 {

	public static void main(String[] args) throws Exception {

		File src = new File(".\\ExcelData\\Countrydata.xlsx");//1.provide the excel file location

		FileInputStream fis = new FileInputStream(src);//2.add the file into inputstream

		XSSFWorkbook wb = new XSSFWorkbook(fis);//3.open the file in excel workbook
		
		XSSFSheet sheet1=wb.getSheet("Sheet1");//4. open the sheet
		int row_count=sheet1.getLastRowNum();
		System.out.println("Total number of rows are:"+row_count);
		
		for(int i=0;i<row_count;i++) {
			
			String data=sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Data from the rows are :"+data);
		}
		wb.close();

	}

}
