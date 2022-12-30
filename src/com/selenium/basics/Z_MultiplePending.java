package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Z_MultiplePending {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe" );
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01jkn5qxujtu541pbopnbf5dc5v12454.node0");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement favui = driver.findElement(By.className("ui-selectonemenu"));
		
		Select select = new Select(favui);
		select.selectByVisibleText("Selenium");
		
		Thread.sleep(2000);
		WebElement manydata = driver.findElement(By.xpath("//button[@type='button']"));
	    manydata.click();
	    
	    Thread.sleep(2000);
	    WebElement secondlayer = driver.findElement(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']"));
	
	    Select s = new Select(secondlayer);
	    
		s.selectByVisibleText("AWS");
		
		
		
		
		
		
	}

}
