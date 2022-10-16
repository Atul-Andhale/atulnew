package Excelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelreading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("E:\\Class\\excel file\\Book1.xlsx");
		
		String city = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
		System.out.println(city);
	}

}
