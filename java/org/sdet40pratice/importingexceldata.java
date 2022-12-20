package org.sdet40pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class importingexceldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
           FileInputStream file = new FileInputStream("./src/test/resources/Exceldata.xlsx");
          Workbook book = WorkbookFactory.create(file);
          
          Sheet sheet = book.getSheet("login credential");
      
DataFormatter df = new DataFormatter();

for(int i=0;i<=sheet.getLastRowNum();i++)
{
	for(int j=0;j<=sheet.getRow(i).getLastCellNum();i++)
	{
		System.out.println( df.formatCellValue(sheet.getRow(i).getCell(j)));
		                                                                                                                                      
		
	}
	
	
}


			
			  
			
}

}

 
       

