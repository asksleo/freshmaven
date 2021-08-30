package cookies;

import java.util.Set;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class addcookies {
	 WebDriver hcl;
  @Test
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  WebDriver hcl = new ChromeDriver();
	  hcl.get("https://myhcl.com/");	
	  Thread.sleep(3000);
	  
	    
			Cookie name = new Cookie("mycookie", "123456789123");
			hcl.manage().addCookie(name);
			
	          
			Set<Cookie> cookiesList =  hcl.manage().getCookies();
			for(Cookie getcookies :cookiesList) {
			    System.out.println(getcookies );
			    System.out.println(cookiesList.size() );
			
		
		hcl.manage().deleteAllCookies();
		cookiesList =  hcl.manage().getCookies();
		
		System.out.println("size of cookies :"+ cookiesList.size() );
}
	}}	
		
  

