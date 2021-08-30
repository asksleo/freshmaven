package excelreading;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xls {
  @Test
  public void f() throws BiffException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  WebDriver hcl = new ChromeDriver();
	  hcl.manage().window().maximize();
	 Workbook w1 = Workbook.getWorkbook(new File("G:\\company\\data1.xls"));
	Sheet s1 = w1.getSheet(0);
	for(int i=1;i<s1.getRows();i++)
	{
		String username = s1.getCell(0,i).getContents();
		String password = s1.getCell(1,i).getContents();
		
		hcl.get("https://ksrtc.in/oprs-web/login/show.do");
	hcl.findElement(By.id("userName")).sendKeys(username);
	hcl.findElement(By.id("password")).sendKeys(password);
	hcl.findElement(By.id("submitBtn")).click();
	}
  }
}
