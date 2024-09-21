package DriverSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
	
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	
		System.setProperty("webdriver.chrome.driver" , "/Users/eyshii/Downloads/chromedriver");
		
		
	 driver = new ChromeDriver();
	 
	 driver.get("https://wwww.facebook.com/");
	 
	 // driver.navigate().to("https://wwww.facebook.com/");
		//new
	 
	 driver.findElement(By.xpath("//a[text()='Create new account']"));
	 
	 WebElement newAccount = driver.findElement( By.xpath("//a[text()='Create new account']"));
	 newAccount.click();
			 
			 Thread.sleep(3000);
			 
			 WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
			 
			 fName.sendKeys(("Eyshita"));
			 
			 
			 WebElement lastName = driver.findElement ( By.xpath ("//input[@name='lastname']"));
			 
			lastName.sendKeys ("Hoque");
			
			
			WebElement email = driver.findElement (By.xpath("//input[@name='reg_email__']"));
			
			email.sendKeys ("myemail1@gmail.com");
			
			
			WebElement password= driver.findElement (By.xpath("//input[@name='reg_passwd__']"));
			password.sendKeys("abracadrabra");
			 
			
			//driver.close(); // for current tab
			//driver.quit(); // for entire browser
			
			// driver.manage().window().equals (maximize();  // for maxmizing window)
			 
			 
			 
	}

}


