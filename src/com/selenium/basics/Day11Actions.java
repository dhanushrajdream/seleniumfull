package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day11Actions {
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement testleaf = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
		
		Actions mouse = new Actions(driver);          //syntax
		 
		mouse.moveToElement(testleaf).build().perform();
		
		///WebElement dd = driver.findElement(By.xpath("//a[text()='WebServices']"));
		//dd.click();
		
		//mouse.doubleClick(dd).build().perform();
		
	
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	  // Thread.sleep(5000);
	  // driver.close();
		
	}

}
