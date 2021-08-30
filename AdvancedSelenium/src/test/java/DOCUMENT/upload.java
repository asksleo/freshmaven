package DOCUMENT;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class upload {
  @Test
  public void f() throws AWTException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  WebDriver hcl = new ChromeDriver();
	  hcl.manage().window().maximize();
	  hcl.get("https://www.ilovepdf.com/excel_to_pdf");
	  
	  Thread.sleep(3000);
	  hcl.findElement(By.id("pickfiles")).click();
	  String file="G:\\company\\data2.xlsx";
	  StringSelection select1= new StringSelection(file);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
	  Thread.sleep(3000);
	  Robot robot1= new Robot();
	  robot1.keyPress(KeyEvent.VK_CONTROL);
	  robot1.keyPress(KeyEvent.VK_V);
	  robot1.keyRelease(KeyEvent.VK_V);
	  robot1.keyRelease(KeyEvent.VK_CONTROL);
	  robot1.keyPress(KeyEvent.VK_ENTER);
	  
  }
}
