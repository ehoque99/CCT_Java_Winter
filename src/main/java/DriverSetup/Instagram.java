package DriverSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	

	static WebDriver driver;  


public static void main(String[] args) throws InterruptedException {
	
	
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver" , "/Users/eyshii/Downloads/chromedriver");
	
	
	
	
 driver = new ChromeDriver();
	 
	 driver.get("https://www.instagram.com//");
	 
	 // driver.navigate().to("https://www.instagram.com//");
		
	
	
Thread.sleep(3000);


WebElement email = driver.findElement(By.xpath("//input[@valuename='email0phone']"));

email.sendKeys(("eyshita.hoque27@gmail.com"));


WebElement fullName = driver.findElement ( By.xpath ("//input[@valuename='fullName']"));

fullName.sendKeys ("Eyshita Hoque");


WebElement Username = driver.findElement (By.xpath("//input[@valuename='Username']"));

Username.sendKeys ("eyshita.10");


WebElement Password= driver.findElement (By.xpath("//input[@valuename='Password"));

Password.sendKeys("abcde"); 


}



		}




	 
	 

		 
	 
	 
			 

	 
	 

		 