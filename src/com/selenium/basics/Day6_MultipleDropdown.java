package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day6_MultipleDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver1\\chromedriver.exe" );
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement find = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s = new Select(find);
		
		Thread.sleep(2000);
		boolean m = s.isMultiple();
		System.out.println(m);
		
		Thread.sleep(2000);
		
		s.selectByValue("3");                                               //selecting maultiple value in single select
		s.selectByIndex(2);
		s.selectByVisibleText("Loadrunner");
		
		Thread.sleep(2000);
		
		s.deselectByIndex(2);                                                //deslecting  (for each used)
		
		System.out.println("=====get options  ===  all options========");
		
		List<WebElement> options = s.getOptions();                            //get text multiple (for each used)
		
		for (WebElement all : options) {
			String text = all.getText();
			System.out.println(text);
			
		}
		System.out.println("=====get all selected options=============");     //get all selected (for each used)
		
		List<WebElement> allselected = s.getAllSelectedOptions();
		
		for (WebElement all2 : allselected) {
			String text2 = all2.getText();
            System.out.println(text2);		
		
		}
		
		System.out.println("=====get first selected===================");       //first selected
		
		WebElement first = s.getFirstSelectedOption();
	    String text3 = first.getText();
	    System.out.println(text3);
	
		s.deselectAll();	
		
		Thread.sleep(10000);
		
		driver.close();
		
		
	}

}
