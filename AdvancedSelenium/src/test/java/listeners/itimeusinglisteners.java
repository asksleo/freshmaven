package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class itimeusinglisteners {
	 WebDriverWait var1;
	 WebDriver hcl;
	 WebDriverWait var2;
	 WebElement search;
  @Test
  public void loginhcl() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  hcl = new ChromeDriver();
	  hcl.get("https://myhcl.com/");
	  var1= new WebDriverWait(hcl,10);
	  var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='i0116']")));
	  hcl.findElement(By.xpath("//*[@id='i0116']")).sendKeys("karan.kumar@hcl.com");
	  hcl.findElement(By.id("idSIButton9")).click();
	  var1.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
	  hcl.findElement(By.id("i0118")).sendKeys("**type your password here***");
	  var1.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	  hcl.findElement(By.id("idSIButton9")).click();
	   var2= new WebDriverWait(hcl,20);
	  var2.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	  hcl.findElement(By.id("idSIButton9")).click();
	  System.out.println("login into hcl passed");
	  Thread.sleep(3000);
  }
  @Test
  public void search() throws InterruptedException {
	  hcl.findElement(By.id("txtSearch")).sendKeys("itime");
	 search= hcl.findElement(By.id("txtSearch"));
	 Thread.sleep(3000);
	  search.sendKeys(Keys.ARROW_DOWN);
	  search.sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  System.out.println("itime entry passed");
	
	  hcl.quit();
	  
	        
  }  
  }

