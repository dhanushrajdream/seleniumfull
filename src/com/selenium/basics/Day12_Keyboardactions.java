package com.selenium.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day12_Keyboardactions {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
			
	     WebDriver driver = new ChromeDriver();
			
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
			
		 Thread.sleep(2000);
		 
		 WebElement gmail = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
		 
		 Actions ac = new Actions(driver);
		 
		 ac.contextClick(gmail).build().perform();
		 
		 Robot rob =new Robot();
		 
		 rob.keyPress(KeyEvent.VK_DOWN);
		 rob.keyRelease(KeyEvent.VK_DOWN);
		 
		 
		 rob.keyPress(KeyEvent.VK_DOWN);
		 rob.keyRelease(KeyEvent.VK_DOWN);
		 
		 rob.keyPress(KeyEvent.VK_DOWN);
		 rob.keyRelease(KeyEvent.VK_DOWN);
		 
		 Thread.sleep(2000);
		 rob.keyPress(KeyEvent.VK_ENTER);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		//ac.contextClick(gmail).build().perform();
		 
		//Robot r = new Robot();
		 
		// Thread.sleep(2000);
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		 
		 //Thread.sleep(2000);
		 //r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		 
		// Thread.sleep(2000);
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		 
		// Thread.sleep(2000);
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);
		 
	}

}
