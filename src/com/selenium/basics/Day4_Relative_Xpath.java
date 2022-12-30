package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//instagram

public class Day4_Relative_Xpath {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		/*
		 * 1.//tagname[@attributename='attributevalue']
		 * 2.(//tagname[@attributename='attributevalue'])[index] 
		 * 3.//tagname[text()='']
		 * 4.//tagname[contains(text(),'')]
		 * 5.//tagname[contains(@attributename,attributevalue)]
		 * 
		 * 6.(//select)[6]
		 */
		Thread.sleep(2000);// username
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("usernameda");
		// getattribute
		String attribute = username.getAttribute("aria-label");
		System.out.println(attribute);

		String attributevalue = username.getAttribute("");
		System.out.println(attributevalue);

		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("password da");

		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']")); // xpath syntax 1
		//boolean displayed = login.isDisplayed();
		//System.out.println(displayed);
		
		String text = login.getText();
		System.out.println(text);
		
		login.click();

		

		
	}

}
