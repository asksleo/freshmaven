package functionality;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import elements.locators;

public class login {
	WebDriver hcl;
  @Test
  public void f() throws IOException, InterruptedException {
	  FileInputStream st= new FileInputStream("src\\test\\java\\functionality\\config.properties");
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
	  hcl.get("https://myhcl.com/");
	  WebDriverWait var1= new WebDriverWait(hcl,10);
	  var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='i0116']")));
	  
	  PageFactory.initElements(hcl, locators.class)	 ;
	  locators.emailid.sendKeys("karan.kumar@hcl.com");
	  Thread.sleep(2000);
	  locators.next.click();
	  Thread.sleep(3000);
	  locators.password.sendKeys("@Narak1234567");
	  Thread.sleep(4000);
	  locators.signin.click();
	  Thread.sleep(10000);
	  hcl.findElement(By.id("idSIButton9")).click();
	  Thread.sleep(3000);
	  hcl.findElement(By.id("txtSearch")).sendKeys("itime");
  
	  
  }
}
