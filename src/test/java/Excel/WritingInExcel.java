package Excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingInExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet(" EMP Info");

		Object empdata[][] = { { " EMPID", "NAME", "JOB" }, { " 101", "PANKAJ", " MANAGER" },
				{ " 102", " SANDEEP", " LEAD" }, { " 103", " VISHWA", "SENIOR LEAD" }

		};
		int rows = empdata.length;
		int cols = empdata[0].length;

		System.out.println("Total rows:" + rows);
		System.out.println("Total cols:" + cols);

		for (int r = 0; r < rows; r++) {

			XSSFRow row = sheet.createRow(r);

			for (int c = 0; c < cols; c++) {
				XSSFCell cell = row.createCell(c);
				Object value = empdata[r][c];

				if (value instanceof String)
					cell.setCellValue((String) value);
				if (value instanceof Integer)
					cell.setCellValue((Integer) value);
				if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);
			}
		}

		String filepath = ".\\ExcelData\\employee1.xlsx";
		FileOutputStream fos = new FileOutputStream(filepath);
		workbook.write(fos);
		fos.close();
		System.out.println(" Employee.xlsx file written sucessfully");
	}

}
