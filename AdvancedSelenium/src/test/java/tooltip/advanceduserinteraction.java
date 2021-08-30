package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class advanceduserinteraction {
	WebDriver hcl;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\karan\\\\eclipse-workspace\\\\chromedriver.exe");
		 hcl= new ChromeDriver();
		 hcl.manage().window().maximize();
		 hcl.get("http://www.leafground.com/pages/tooltip.html");
		
		JavascriptExecutor js = (JavascriptExecutor) hcl;
	      js.executeScript("window.scrollBy(0,350)");   
	      WebElement element = hcl.findElement(By.id("age"));
	      Actions action = new Actions(hcl);
	      action.moveToElement(element).build().perform();
	      WebElement toolTipElement = hcl.findElement(By.cssSelector(".ui-tooltip"));
	      String toolTipText = toolTipElement.getText();
	      System.out.println("The Tooltip Text is: "+toolTipText);
	      hcl.close();
	   
	
  }
}
