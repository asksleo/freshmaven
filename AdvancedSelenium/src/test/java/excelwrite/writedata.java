package excelwrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class writedata {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  WebDriver hcl = new ChromeDriver();
	  hcl.manage().window().maximize();
	 String w1 =("G:\\company\\data2.xlsx");
	File s1 = new File(w1);
	FileOutputStream fos= new FileOutputStream(s1);
	XSSFWorkbook w2= new XSSFWorkbook();
	
  }
}
