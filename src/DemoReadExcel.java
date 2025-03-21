package Rediff;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoReadExcel {

	
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
    FileInputStream fs =new FileInputStream("C:\\JarFiles\\empinfo.xlsx");
    XSSFWorkbook myWB= new XSSFWorkbook(fs);
    XSSFSheet mysheet=myWB.getSheet("EMPinfo");
    XSSFRow myrow;
    XSSFCell mycell;
int rowcount =mysheet.getLastRowNum();
for(int i=0;i<rowcount;i++)
{
	
	
		myrow=mysheet.getRow(i);
		int colcount =myrow.getLastCellNum();
		for(int j=0;j<colcount;j++)
		{
			mycell=myrow.getCell(j);
			switch (mycell.getCellType())
			{
			case STRING:
				System.out.println(mycell.getStringCellValue());
				break;
			case NUMERIC:
				System.out.println("  "+mycell.getNumericCellValue());
				break;
			case BOOLEAN:
				System.out.println(mycell.getBooleanCellValue());
				break;
				
				default:
					System.out.println(mycell.getDateCellValue());
					break;
					
				
			};
		}
				
	}

}
}	


