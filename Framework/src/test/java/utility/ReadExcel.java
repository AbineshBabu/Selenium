package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel{
	
	static HSSFWorkbook hf;
	static HSSFSheet sheet;
	

	public ReadExcel(String pathname) throws Exception {
		
		File f=new File(pathname);
		
		FileInputStream f1=new FileInputStream(f);
		
		hf=new HSSFWorkbook(f1);
		
		
	}
	
	public String getAlphabets(int sheetNumber,int row,int col) {
		sheet=hf.getSheetAt(sheetNumber);
		
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		
		return data;
	}
	
	public double getNumber(int sheetNumber,int row,int col) {
		sheet=hf.getSheetAt(sheetNumber);
		
		double data=sheet.getRow(row).getCell(col).getNumericCellValue();
		
		return data;
	}
	

}
