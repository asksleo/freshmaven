package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step1 {
	WebDriver hcl ;
	WebDriverWait var1;
	WebDriverWait var2;
	WebElement search;
	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karan\\eclipse-workspace\\chromedriver.exe");
		hcl= new ChromeDriver();
		hcl.get("https://myhcl.com/");
		var1= new WebDriverWait(hcl,10);
	  System.out.println("given done");
	  
	  
	}
	@When("Enter Username and Enter Password and click on login button")
	public void enter_username_and_enter_password_and_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='i0116']")));
		hcl.findElement(By.xpath("//*[@id='i0116']")).sendKeys("karan.kumar@hcl.com");
		hcl.findElement(By.id("idSIButton9")).click();
		var1.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
		hcl.findElement(By.id("i0118")).sendKeys("@Narak1234567");
		var1.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
		hcl.findElement(By.id("idSIButton9")).click();
		var2= new WebDriverWait(hcl,20);
		  System.out.println("when done");
	
}
	@Then("Login success")
	public void login_success() {
	    // Write code here that turns the phrase above into concrete actions
		var2.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
		hcl.findElement(By.id("idSIButton9")).click();
		hcl.findElement(By.id("txtSearch")).sendKeys("itime");
		search= hcl.findElement(By.id("txtSearch"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
			}
		System.out.println("then done");
	}
		
		@When("enter invalid username and password")
		public void enter_invalid_username_and_password()
		{
		 System.out.println("when login failed case");
		}
		
		@Then("Login failed")
		public void Login_failed()
		{
		 System.out.println("Then login failed case");
		}
		
		
	}




