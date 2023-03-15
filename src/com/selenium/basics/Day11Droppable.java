package com.selenium.basics;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day11Droppable {
	
	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\d5raj\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("http://leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions mouse = new Actions(driver);
		
		//drag and drop
		mouse.dragAndDrop(source, target).build().perform();
		*/
		
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01ff8kfwac1dth102os4ii4mdqv34087.node0");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.id("form:conpnl_content"));
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.id("form:drag_content"));
		
		Actions mouse = new Actions(driver);
		
		Thread.sleep(2000);
		//drag and drop
		mouse.dragAndDrop(source, target).build().perform();
		
	}

}
