package com.selenium.basics;

import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10Javascriptexecuter {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement lastbutton = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));                 //finding back to top button
		
		JavascriptExecutor js = (JavascriptExecutor) driver;                                                             //syntax for javascript executor
		
		js.executeScript("arguments[0].scrollIntoView();", lastbutton);                                                  //scroll into view
		
		//scroll into view in javascript
		Thread.sleep(5000); 
		WebElement book = driver.findElement(By.xpath("//span[text()='Best Sellers in Books']"));                       //to move to another image
		js.executeScript("arguments[0].scrollIntoView();", book);
		
		//scroll with xy axis in javascript
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,2000);");
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,5000);");
		
		//click function in javascript
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();" ,book);                                  
		
		
	
		
		
		
		
		
		Thread.sleep(10000);
		driver.close();
	}
}
