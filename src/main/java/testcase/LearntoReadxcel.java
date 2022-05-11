package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearntoReadxcel {

	public static void main(String[] args) throws IOException {

		//Set the path of the Xcel file
		
	XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
	//hit the sheet
	XSSFSheet sheet = wb.getSheetAt(0);
	//sheet-->row
	
	  XSSFRow row = sheet.getRow(1); //row-->cell 
	  XSSFCell cell = row.getCell(1);
	  String stringCellValue = cell.getStringCellValue();
	
	int RowCount = sheet.getLastRowNum();
	System.out.println(RowCount);
	
	int colCount = row.getLastCellNum();
	System.out.println(colCount);
		
		for(int i=1;i<=RowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String stringCellValue2 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue2);
			}
		}
		
		
	/*
	 * String stringCellValue = cell.getStringCellValue();
	 * 
	 * System.out.println(stringCellValue);
	 */
		
		wb.close();
	}

}
