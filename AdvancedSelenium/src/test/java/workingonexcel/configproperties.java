package workingonexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class configproperties {
	WebDriver hcl;
  @Test
  public void f() throws IOException, InterruptedException {
	  FileInputStream st= new FileInputStream("src\\test\\java\\workingonexcel\\config.properties");
	  Properties prop=new Properties();
	  prop.load(st);
	  String browser_name=prop.getProperty("browser");
	  String Driver_path=prop.getProperty("driver_path");
	  if(browser_name.equalsIgnoreCase("chrome"))
	  {
		  
	  System.setProperty("webdriver.chrome.driver", Driver_path);
	  hcl = new ChromeDriver();
	  
	  }
	  else if (browser_name.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", Driver_path);
		  hcl = new FirefoxDriver();
		  
	  }
	  else {
		  System.setProperty("webdriver.ie.driver", Driver_path);
		  hcl = new InternetExplorerDriver();
	  }

	 
	  hcl.manage().window().maximize();
	  hcl.get("http://www.leafground.com/pages/download.html");
	  hcl.findElement(By.linkText("Download Excel")).click();
	Thread.sleep(8000);
  }
	@AfterTest
	public void find()
	{
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
