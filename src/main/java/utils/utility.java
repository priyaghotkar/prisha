package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
	
	private static String data;

	public static void captureScreenshot(WebDriver driver, int TestID) throws IOException
	{
		String path = "C:\\Users\\Onyx\\Desktop\\java progrms";
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-YYYY HH.mm.ss");
		LocalDateTime now = LocalDateTime.now();
		String dtf = dt.format(now);
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File(path+" "+TestID+" "+dtf+".jpg");
		FileHandler.copy(src, dest);
		
	}
	
	public static String getExcelSheetData(String sheet , int a, int b) throws IOException
	{
		String data;
		String path = "C:\\Users\\Onyx\\Desktop\\NewProgrmExel.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(file);
		
		try
		{
		data	= book.getSheet(sheet).getRow(a).getCell(b).getStringCellValue();
		}
		catch(Exception e)
		{
		Double s	= book.getSheet(sheet).getRow(a).getCell(b).getNumericCellValue();
		data = Double.toString(s);
		}
		return data;
	}

}
