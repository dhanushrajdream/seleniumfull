package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
//https://demoqa.com/select-menu

public class Day6aMultipleDemoQa {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe" );
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("Incognito");
	
		WebDriver  driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement manydata = driver.findElement(By.id("cars"));
		//syntax
		Select s = new Select(manydata); 
		s.selectByVisibleText("Volvo");
		s.selectByIndex(2);
		s.selectByValue("audi");
		Thread.sleep(2000);
		s.deselectByIndex(2);
		System.out.println("------------all options-------");
		List<WebElement> alloptions = s.getOptions();
		
		for (WebElement all : alloptions) {
			String text = all.getText();
			System.out.println(text);
		}
		Thread.sleep(2000);
		System.out.println("------------all selected options-------");
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (WebElement priyaakka : allSelectedOptions) {
			String text2 = priyaakka.getText();
	        System.out.println(text2);	
		}
		Thread.sleep(2000);
		System.out.println("------------first selected options-------");
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text3 = firstSelectedOption.getText();
		System.out.println(text3);
		
	}

}
