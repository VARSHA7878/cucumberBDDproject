package Rediff;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoWriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       //Two types of excel files
		//1.xls---old format
		//for we are going to use hssf classes
		//2.xlsx--new format
		//for we are going to use xssf classes
		/* workbook=>sheet-->row->cell
		workbook is an interface which is inherited by hssworkbook xssfworkbook
		same is the case for sheet row and cell
		 means sheet is an Interface which is inherited by hssfsheet xssfsheet 
		 Row is an interface which is inherited by hssfrow xssfrow
		 cell is an interface which is inherited by hssfcell xssfcell
		 * we are going to use  all above  HSSF classes XSSF classes*/
		 XSSFWorkbook mywrkbk=new XSSFWorkbook();
		 XSSFSheet newsheet =mywrkbk.createSheet("EMPinfo");
		 Object empData[][]= {{"Emp Id","Emp Name","Emp dept"},
		 		{3001,"Pravin","Hr"},
		 		{3002,"varsha","Accounts"},
		 		{3003,"parth","IT"}};
		 int rowcnt=empData.length;
		 int colcnt =empData[0].length;
		 for(int i=0;i<rowcnt;i++)
		 {
			 XSSFRow newrow = newsheet.createRow(i);//can create one row a time
			 for(int j=0;j<colcnt;j++)
			 {
				 XSSFCell newcell=newrow.createCell(j);////can create one cell a time
			      Object cellvalue =empData[i][j];
			      if (cellvalue instanceof String)
			      {
			    	  newcell.setCellValue((String)cellvalue);
			      }
			      if (cellvalue instanceof Integer)
			      {
			    	  newcell.setCellValue((Integer)cellvalue);
			      
			      }
			 }
			
		 }
		 //to create a physical file
		 String excelpath="C:\\JarFiles\\empinfo.xlsx";
		 FileOutputStream fos = new FileOutputStream(excelpath);
		 mywrkbk.write(fos);
		 fos.close();
		 System.out.println("file created");
			}

}
