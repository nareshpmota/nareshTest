package ExportExcelIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import utilities.PageObject;

public class ExcelOp extends PageObject {
    public static String filename=prop.getProperty("filename");
    public static FileInputStream finput;
    public static File login;
    public static Workbook book=null;
    public static Sheet loginSheet;
    public static Row row;
    public static String loginExcelFilePath=new String();
    public ExcelOp() throws IOException {
    	
    	loginExcelFilePath=System.getProperty("user.dir")+filename;
    	login =new File(loginExcelFilePath);
    	System.out.println(new File(loginExcelFilePath).getAbsolutePath());
    	finput = new FileInputStream(login);
    	book=new XSSFWorkbook(finput);
    	loginSheet=book.getSheet("Sheet1");
    }
    
    public static String getCellValue(int rowNum,int cellNum) {
    	String value=loginSheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
    	
    }
	
}
