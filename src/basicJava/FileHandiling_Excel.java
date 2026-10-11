package basicJava;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class FileHandiling_Excel 
{
	
	public static void read_exceldata() throws Exception
	
	{
		
		/*
		for(int i = 1; i<11; i++)
		{
			System.out.println(i);
		}
		*/
		
		
		
		FileInputStream fis = new FileInputStream("./testdata/exceldata.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Imported data");
		
		int nr = sh1.getPhysicalNumberOfRows(); //nr=4
		
		for(int a=0; a<nr; a++)
		{
			XSSFRow row = sh1.getRow(a); //a=0,
			int nc = row.getPhysicalNumberOfCells(); //a=0; nc=4
			
			for(int b=0; b<nc; b++)
			{
				XSSFCell col = row.getCell(b);
				
				if(col.getCellType() == CellType.STRING) 
				{
					System.out.println(col.getStringCellValue());
				}
				
				else if(col.getCellType() == CellType.BOOLEAN) 
				{
					System.out.println(col.getBooleanCellValue());
				}
				
				else if(col.getCellType() == CellType.NUMERIC) 
				{
					if(DateUtil.isCellDateFormatted(col)) 
					{
						SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
						System.out.println(sdf.format(col.getDateCellValue()));
					}
					
					else 
					{
						System.out.println(col.getNumericCellValue());
					}
					
					
					
				}
			}
			
			System.out.println("------------------------------");
		}
		
		
		/*
		//First row
		XSSFRow row1 = sh1.getRow(0);
		
		XSSFCell col1 = row1.getCell(0);
		System.out.println(col1.getStringCellValue());

		XSSFCell col2 = row1.getCell(1);
		System.out.println(col2.getStringCellValue());
		
		XSSFCell col3 = row1.getCell(2);
		System.out.println(col3.getNumericCellValue());
		
		XSSFCell col4 = row1.getCell(3);
		System.out.println(col4.getDateCellValue());

		System.out.println(" -------------------------  ");
		
		// Second row
		XSSFRow row2 = sh1.getRow(1);

		XSSFCell col21 = row2.getCell(0);
		System.out.println(col21.getStringCellValue());

		XSSFCell col22 = row2.getCell(1);
		System.out.println(col22.getStringCellValue());

		XSSFCell col23 = row2.getCell(2);
		System.out.println(col23.getStringCellValue());
		
		XSSFCell col24 = row2.getCell(3);
		System.out.println(col24.getBooleanCellValue());

	*/
		
		
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		read_exceldata();
	}
	
}

