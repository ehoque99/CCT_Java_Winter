package DriverSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {
	
		static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	



		System.setProperty("webdriver.chrome.driver" , "/Users/eyshii/Downloads/chromedriver");
	
	driver = new ChromeDriver ();

	driver.get("https://cars.hotels.com/en-us/?clientID=541572#/searchcars");
	
	
	
	 WebElement Group = driver.findElement( By.xpath("//a[text()='Groups & Meetings']"));
	 Group.click();
	
	 
	 Thread.sleep(7000);
	 
	 for (String windowHandle : driver.getWindowHandles())   {
	 driver.switchTo().window(windowHandle);
	 }
	 
	
	 
	 
	 WebElement Destination = driver.findElement( By.xpath("//input[@name='Destination1Text']"));
	 Destination.sendKeys("London");
	
	 
	 

	
	 
}	
	}
