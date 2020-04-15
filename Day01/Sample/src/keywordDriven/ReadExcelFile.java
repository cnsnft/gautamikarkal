package keywordDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	public Sheet readExcel() throws IOException{
	File file =    new File("D:\\Day01\\Sample\\TestData.xlsx");
	FileInputStream inputStream = new FileInputStream(file);
    Workbook wb = new XSSFWorkbook(inputStream);
    Sheet sheet = (Sheet) wb.getSheet("Sheet1");
	return sheet;
	}
}
