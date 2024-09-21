package DriverSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* // Selenium Wait : 
		  1. Implicit wait(Global), 
		  2. Explicit wait(Conditional), 
		  3. Fluent wait(intermittent) 
		 
		//Implicit Wait
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		//Explicit Wait
		  WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		  explicitWait.until(ExpectedConditions.elementToBeClickable(WebElement));


		//Fluent Wait
		  FluentWait fluentWait = new FluentWait(driver);        
		  fluentWait.withTimeout(10, TimeUnit.SECONDS);
		  fluentWait.pollingEvery(2, TimeUnit.SECONDS);  */
		
		
		
		

		System.setProperty("webdriver.chrome.driver" , "/Users/eyshii/Downloads/chromedriver");
		 
		 driver = new ChromeDriver();
		 
		 driver.get("https://wwww.facebook.com/");
		 
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  //implicit wait
		 
		 
		 
		 
		 WebElement newAccount = driver.findElement( By.xpath("//a[text()='Create new account']"));
		 newAccount.click();
		 
		 
		 WebDriverWait exWait = new WebDriverWait (driver,3);
		 
		 //WebDriverWait exWait = new WebDriverWait(driver, Duration.ofSeconds (38)) ;
		 
		 By firstName = (By.xpath("//input (@name='firstname']"));
		 
		 exWait.until(ExpectedConditions.presenceOfElementLocated(firstName));

		 
		 WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		 
		 fName.sendKeys("Eyshita");
// change for git
	
	}

}
