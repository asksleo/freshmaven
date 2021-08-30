package excelreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class poi {
	WebDriver hcl;
  @Test
  public void f() throws IOException { 
	  
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
  hcl = new ChromeDriver();
  hcl.manage().window().maximize();
   File src =new File("G:\\company\\data3.xlsx");
 FileInputStream finput= new FileInputStream(src);
 XSSFWorkbook workbook=  new XSSFWorkbook(finput);
 XSSFSheet sheet=workbook.getSheetAt(0);
 	for(int i=1;i<sheet.getLastRowNum( );i++)
 	{
 		XSSFCell cell=sheet.getRow(i).getCell(0);
 		DataFormatter formatter = new DataFormatter();
 		String username = formatter.formatCellValue(cell);
 		cell = sheet.getRow(i).getCell(1);
 		String password = formatter.formatCellValue(cell);
 		
 		hcl.get("https://ksrtc.in/oprs-web/login/show.do");
 	hcl.findElement(By.id("userName")).sendKeys(username);
 	hcl.findElement(By.id("password")).sendKeys(password);
 	hcl.findElement(By.id("submitBtn")).click();
 	}
  }
 	@AfterTest
 	public void t() {
 		System.out.print("successfully passed");
 	
 	hcl.quit();
 
}}
