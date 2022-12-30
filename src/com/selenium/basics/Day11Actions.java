package com.selenium.basics;

import org.openqa.selenium.By;                      //click
import org.openqa.selenium.WebDriver;               //mouse.moveToElement(testleaf).build().perform();
import org.openqa.selenium.WebElement;              //mouse.doubleClick(webelement).build().perform();
import org.openqa.selenium.chrome.ChromeDriver;     //mouse.contextClick(webelement).build().perform();
import org.openqa.selenium.interactions.Actions;

public class Day11Actions {
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement testleaf = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
		
		Actions mouse = new Actions(driver);                                           //syntax
		
		
		Thread.sleep(2000);//move to element
		mouse.moveToElement(testleaf).build().perform();
		
		
		Thread.sleep(2000); //double click
		WebElement dd = driver.findElement(By.xpath("//a[text()='WebServices']"));
		dd.click();
		
		mouse.doubleClick(dd).build().perform();
		
	
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	  // Thread.sleep(5000);
	  // driver.close();
		
	}

}
