package Excelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("E:\\Class\\excel file\\Book1.xlsx");
		
		Workbook file = WorkbookFactory.create(myfile);
		Sheet mysheet = file.getSheet("Sheet1");
		Row myrow = mysheet.getRow(1);
		Cell mycell = myrow.getCell(1);
		CellType info = mycell.getCellType();
		System.out.println(info);
		
		System.out.println("=================================");
		
		Sheet mysheet1 = file.getSheet("Sheet1");
		
		for(int i=0;i<=1;i++) 
		{
			for(int j=0;j<=2;j++) 
			{
			 
				String value = mysheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}

		
	}

}
