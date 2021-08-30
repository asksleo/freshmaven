package workingonexcel;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findingfile {
	WebDriver hcl;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  hcl = new ChromeDriver();
	  hcl.manage().window().maximize();
	  hcl.get("http://www.leafground.com/pages/download.html");
	  hcl.findElement(By.linkText("Download Excel")).click();
	File filelocation= new File ("C:\\Users\\karan\\Downloads");
	File[] total_files=filelocation.listFiles();
	for(File file:total_files)
	{
		if(file.getName().equalsIgnoreCase("testleaf.xlsx")) {
			System.out.println("file is ready");
		}
	}
  }
}
