package extentreports;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReport {
ExtentTest logger;
ExtentReports extent;
WebDriverWait var1;
WebDriver hcl;
WebDriverWait var2;
WebElement search;


@BeforeTest

public void startReport(){
extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);

extent
               .addSystemInfo("Host Name", "Local Host")
               .addSystemInfo("Environment", "Automation Testing")
               .addSystemInfo("User Name", "karan kumar");
               extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
}
@Test
public void loginhcl() throws InterruptedException {
	logger=extent.startTest("demo login hcl");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
	  hcl = new ChromeDriver();
	  hcl.get("https://myhcl.com/");
	  var1= new WebDriverWait(hcl,10);
	  var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='i0116']")));
	  hcl.findElement(By.xpath("//*[@id='i0116']")).sendKeys("karan.kumar@hcl.com");
	  hcl.findElement(By.id("idSIButton9")).click();
	  var1.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
	  hcl.findElement(By.id("i0118")).sendKeys("@Narak1234567");
	  var1.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	  hcl.findElement(By.id("idSIButton9")).click();
	   var2= new WebDriverWait(hcl,20);
	  var2.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
	  hcl.findElement(By.id("idSIButton9")).click();
	  System.out.println("login into hcl passed");
	  Thread.sleep(3000);
	  logger.log(LogStatus.PASS, "HCL LOGIN");
	  logger.log(LogStatus.FAIL, "HCL LOGIN FAIL");

}
@Test
public void search() throws InterruptedException {
	logger=extent.startTest("ITIME");
	
	  hcl.findElement(By.id("txtSearch")).sendKeys("itime");
	 search= hcl.findElement(By.id("txtSearch"));
	 Thread.sleep(3000);
	  search.sendKeys(Keys.ARROW_DOWN);
	  search.sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  System.out.println("itime entry passed");
	  logger.log(LogStatus.PASS, "ITIME LOGIN PASS");
	  logger.log(LogStatus.FAIL, "ITIME LOGIN FAIL");

}
/*public void getResult(ITestResult result){
if(result.getStatus() == ITestResult.FAILURE){
logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
}else if(result.getStatus() == ITestResult.SKIP){
logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
}
extent.endTest(logger);
}*/
@AfterMethod
public void getResult(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		logger.log(LogStatus.FAIL, result.getThrowable());
	}
	extent.endTest(logger);
}
@AfterTest
public void endTest()
{

	
     extent.flush();
     extent.close();
     hcl.close();
}
}