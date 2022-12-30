package com.selenium.basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day16_DynamicXpath {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
			
		 driver.get("http://www.leafground.com/pages/drop.html");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 
		 WebElement sen = driver.findElement(By.xpath("//div[@id='draggable']"));
		 WebElement tar = driver.findElement(By.id("droppable"));
		 
		 Actions ac =new Actions(driver);
		 
		 ac.dragAndDrop(sen, tar).build().perform();
		 
		 
		 
	     
	    
	    
		 
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
