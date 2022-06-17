package com.selenium.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day13_WindowsHandles {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver1\\chromedriver.exe");
			
	     WebDriver driver = new ChromeDriver();
			
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 
		
		 
		 //new tab best sellers	
		 Thread.sleep(2000);
		 WebElement bestseller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		 
		 Actions ac =new Actions(driver);
		 ac.contextClick(bestseller).build().perform();
		 
		 Robot r = new Robot(); 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 //new tab mobiles
		 WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		 
		 Thread.sleep(2000);
		 ac.contextClick(mobiles).build().perform();
		 
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 //new tab new releases
		 WebElement newrealese = driver.findElement(By.xpath("//a[text()='New Releases']"));
		 
		 //Thread.sleep(2000);
		 ac.contextClick(newrealese).build().perform();
		 
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 //new tab computers
		 WebElement computers = driver.findElement(By.xpath("//a[text()='Computers']"));
		 
		 Thread.sleep(2000);
		 ac.contextClick(computers).build().perform();
		 
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 //to get window handles
		 Thread.sleep(2000);
		 Set<String> windowHand = driver.getWindowHandles();
		 //iterating one by one and getting url and title using switchTo
		for (String all : windowHand) {
			System.out.println(all);
			String title = driver.switchTo().window(all).getTitle();
			System.out.println(title);
			String currentUrl = driver.switchTo().window(all).getCurrentUrl();
			System.out.println(currentUrl);
			System.out.println("================================================");
		}
		 //to know about if case in (foreach)
		
		     Thread.sleep(2000);
		     String vada ="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";  //tomatch this words
		 for (String all1 : windowHand) {
			 if (driver.switchTo().window(all1).getTitle().equalsIgnoreCase(vada)) {
				 System.out.println(vada);
				 break;
				 
				
			}		
		}	 	
	}
}
