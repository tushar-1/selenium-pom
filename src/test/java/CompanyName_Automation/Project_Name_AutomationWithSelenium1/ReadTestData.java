package CompanyName_Automation.Project_Name_AutomationWithSelenium1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {
//public static void main(String[] args) {
	public static Object[][] testDataFromExcel(){
	try {
	FileInputStream xlFile = new FileInputStream("../Project_Name_AutomationWithSelenium1/uploadexe/MyTestDataSheet.xlsx");
	//if your excel file extension .xlsx and using Apache POI
	XSSFWorkbook wb = new XSSFWorkbook(xlFile);
	//if your excel file extension .xlsx and using Apache POI
	//HSSFWorkBook wb = new HSSFWorkBook(xlFile);
	XSSFSheet sh = wb.getSheet("Login");
	int rowcount = sh.getPhysicalNumberOfRows(); //returns the active row count
	int colcount = sh.getRow(0).getPhysicalNumberOfCells();
	Object[][] td = new Object[rowcount-1][colcount];
	for(int i=1;i<rowcount;i++);
	{
	int i = 0;
	XSSFRow rw = sh.getRow(i);
	for(int j=0;j<rowcount;j++);
	{
	int j = 0;
	XSSFCell cell = rw.getCell(j);
	String cellvalue = cell.getStringCellValue();
	System.out.println(cellvalue);
	td[i-1][j]=cellvalue;
	}
	}
	wb.close();
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
		Object[][] td = null;
	return td;
	}
	public static void main(String[] args) {
		Object[][]td = ReadTestData.testDataFromExcel();
		for(int i=1;i<td.length;i++)
		{
			for(int j=0;j<td[0].length;j++)
			{
				System.out.println(td[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
