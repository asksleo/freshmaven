package cookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Cookiesdata {
	Cookie ck;
	WebDriver hcl;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  WebDriver hcl = new ChromeDriver();
	  hcl.get("https://myhcl.com/");
	  WebDriverWait var1= new WebDriverWait(hcl,10);
	  var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='i0116']")));
	  hcl.findElement(By.xpath("//*[@id='i0116']")).sendKeys("karan.kumar@hcl.com");
	  hcl.findElement(By.id("idSIButton9")).click();
	  var1.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
	  hcl.findElement(By.id("i0118")).sendKeys("@Narak1234567");
	  var1.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	  hcl.findElement(By.id("idSIButton9")).click();
	  WebDriverWait var2= new WebDriverWait(hcl,20);
	  var2.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	  hcl.findElement(By.id("idSIButton9")).click();
	  hcl.findElement(By.id("txtSearch")).sendKeys("itime");
	  File file1 =new File("cookies.data");
	  try
	  {
		  file1.createNewFile();
		  FileWriter fw= new FileWriter(file1);
		  BufferedWriter bw=new BufferedWriter(fw);
		  for(Cookie ck: hcl.manage().getCookies()) {
			  bw.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
		  bw.newLine();
		  
		  
		
		  }
		  Set<Cookie> ck =hcl.manage().getCookies();
		   Cookie ck1 = new Cookie ("karan","12345678854");	
	       hcl.manage().addCookie(ck1); 
	       
	       System.out.println("size of cookie"+ ck.size());
	  
		  bw.close();
		  fw.close();
		  
	  }
	  
	  
	  catch (Exception e)
	  {
	  System.out.println(e);
	  
  
	  
	  
	        
	  }}
	  public void ClearBrowserCache() throws InterruptedException
	  {
	hcl.manage().deleteAllCookies(); //delete all cookies
	  Thread.sleep(7000);
	  Set<Cookie> ck =hcl.manage().getCookies();
	  System.out.println("size of cookie"+ ck.size());//wait 7 seconds to clear cookies.
	  }
	  
  }
  
  


