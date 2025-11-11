package com.coverfox.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	public static void getscreenShot(WebDriver driver, String screen ) throws IOException
	{
String Timestamp=new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss").format(new Date());
		
		File one=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(one);
		String path = System.getProperty("user.dir");
		File two=new File(path+"\\sc\\"+screen+Timestamp+".png");
		FileHandler.copy(one, two);
	}
		
	public static void scrollIntoView(WebDriver driver,WebElement webElement ) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true),webElement");
		System.out.println("scrolling into view..."+webElement.getText());

	}
	public static void waitForElementExplicitly(WebDriver driver,long waitTime,WebElement webElement ) {
		
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(waitTime));
		 wait.until(ExpectedConditions.visibilityOf(webElement));
		 System.out.println("wait for element for "+waitTime);
	}
	public static String readDatafromexcel(String sheetname , int row ,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream myFile= new FileInputStream("C:\\Users\\abhis\\OneDrive\\Desktop\\Book1.xlsx");
	Sheet mysheet= WorkbookFactory.create(myFile).getSheet(sheetname);
	String testdata= mysheet.getRow(row).getCell(cell).getStringCellValue();
	System.out.println("reding data from excel"+ testdata);
	return testdata;
	
}
	public static String readDataFromProperty(String key) throws IOException {
	Properties properties=new Properties();
	FileInputStream myfile=new FileInputStream("C:\\Users\\abhis\\eclipse-workspace\\CoverFoxBBD\\src\\main\\resources\\config\\config.properties");
	properties.load(myfile);
	String data = properties.getProperty(key);
	System.out.println("reading data from properties" + data);
	
	return data;
}
	public static void handleDropDOwnUsingVisibleText(WebElement element ,String visibleText) {
		
		Select select=new Select(element);
		select.selectByVisibleText(visibleText);
		System.out.println("handling drop down,value is" +visibleText);
		
	}
	
	
	
}

