package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelPOI {

	public void ReadEx(String filePath, String fileName, String sheetName) throws IOException {

		// create object of the file to open excel

		File file = new File(filePath);

		// Create Object of the FileInputstream class to read the excel file

		FileInputStream InputStream = new FileInputStream(file);

		Workbook guru99Workbook = new XSSFWorkbook(InputStream);
		
		// Find the file extension by splitting file name in substring and getting only
		// extension name

		/*
		 * String fileExtensionName = fileName.substring(fileName.indexOf("."));
		 * 
		 * // Check condition if the file is xlsx file
		 * 
		 * if (fileExtensionName.equals(".xlsx")) {
		 * 
		 * // If it is xlsx file then create object of XSSFWorkbook class
		 * 
		 * guru99Workbook = new XSSFWorkbook(InputStream);
		 * 
		 * }
		 */

		/*
		 * // Check condition if the file is xls file
		 * 
		 * else if (fileExtensionName.equals(".xls")) {
		 * 
		 * // If it is xls file then create object of HSSFWorkbook class
		 * 
		 * guru99Workbook = new HSSFWorkbook(InputStream);
		 * 
		 * }
		 */
		
		// Read sheet inside the workbook by its name

	org.apache.poi.ss.usermodel.Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

		// Find number of rows in excel file

		int rowCount = guru99Sheet.getLastRowNum() - guru99Sheet.getFirstRowNum();

		// create loop to read all data from excel

		for (int i = 0; i < rowCount + 1; i++) {

			Row row = guru99Sheet.getRow(i);

			//// Create a loop to print cell values in a row
			for (int j = 0; j < row.getLastCellNum(); j++) {

				// Print Excel data in console

				System.out.print(row.getCell(j).getStringCellValue() + "|| ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Create an object of ReadGuru99ExcelFile class
		ReadExcelPOI objExcelFile = new ReadExcelPOI();

		// Prepare the path of excel file

		String filePath =  "C:\\Users\\admin\\eclipse-workspace\\Change2022\\src\\DataRead.xlsx";

		// Call read file method of the class to read data

		objExcelFile.ReadEx(filePath, "DataRead.xlsx", "Reading");

	}

}
