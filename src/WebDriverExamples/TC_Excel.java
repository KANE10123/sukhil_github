package WebDriverExamples;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class TC_Excel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Sukhil Hariharan\\Desktop\\selenium\\ReadExcel.xls");
		Workbook w1=Workbook.getWorkbook(file);
		Sheet s1=w1.getSheet("Sheet1");
		int rows = s1.getRows(); //to get row count
		System.out.println(rows);
		for (int i=1;i<rows;i++) {
		int rows1 = s1.getRows(); //to get row count
		int i1=2; //reading data from one particular row
		String EmpID=s1.getCell(0, i1).getContents ();
		String EmpName=s1.getCell(1, i1).getContents ();
		String EmpSal=s1.getCell(2, i1).getContents ();
		System.out.println(EmpID);
		System.out.println(EmpName);
		System.out.println(EmpSal);
	}

	}
}
