package com.selenium.basics;

import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10Javascriptexecuter {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\d5raj\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement lastbutton = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));                 //finding back to top button
		
		JavascriptExecutor js = (JavascriptExecutor) driver;                                                             //syntax for javascript executor
		
		js.executeScript("arguments[0].scrollIntoView();", lastbutton);                                                  //scroll into view
		
		//scroll into view in javascript
		Thread.sleep(5000); 
		WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));                       //to move to another image
		js.executeScript("arguments[0].scrollIntoView();", sell);
		
		
		//scroll with xy axis in javascript
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-5000);");
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,2000);");
		
		//click function in javascript
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();" ,sell);                                  
		
		
		Thread.sleep(5000);
		
		
		driver.close();
	}
}
