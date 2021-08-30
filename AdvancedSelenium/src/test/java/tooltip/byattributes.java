package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class byattributes {
	WebDriver hcl;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\karan\\\\eclipse-workspace\\\\chromedriver.exe");
	 hcl= new ChromeDriver();
	 hcl.manage().window().maximize();
	 hcl.get("http://www.leafground.com/pages/tooltip.html");
	WebElement ele =hcl.findElement(By.id("age"));
	String tool_tip=ele.getAttribute("title");
	System.out.println(tool_tip);
	hcl.quit();
	
  }
}

