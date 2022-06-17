package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//instagram

public class Day4_Relative_Xpath {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver1\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("username"));
	    username.sendKeys("usernameda");
	    
	    String attribute = username.getAttribute("aria-label");
	    System.out.println(attribute);
	    
	    String attributevalue = username.getAttribute("");
	    System.out.println(attributevalue);
	    
	    WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys("password da");
	    
	    
	 //  WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));    //xpath syntax 1
	  // login.isDisplayed();
	   //System.out.println(login);
	   
	  // String text = login.getText();
	  // System.out.println(text);
	    
	  // WebElement findElement = driver.findElement(By.xpath("//div[text()='Log In']")); //xpath syntax 3
	    
	  // WebElement findElement1 = driver.findElement(By.xpath("//input[contains(text(),'aria-label')]"));   error
	   // findElement1.click();	
	
	
	
	
	
	
	
	
	
	}

}
