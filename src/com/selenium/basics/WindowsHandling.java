package com.selenium.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
			
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 
		 WebElement bestsellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		 
		 Actions ac = new Actions(driver);                              //for context click(right click)
		 ac.contextClick(bestsellers).build().perform();
		 
		 Robot r =new Robot();                                          //for one down button in keyboard
		 
		 //best seller
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
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
		 
		 Set<String> windowHandles = driver.getWindowHandles();
		 
		 for (String str : windowHandles) {
			System.out.println(str);
			String title = driver.switchTo().window(str).getTitle();
            System.out.println(title);
		 }
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
			
		}
		 
		
			
		
	
	
}




