package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Locators {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		 System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver1\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();  //upcasting syntax
	
		 
		 driver.get("https://www.facebook.com/");
		 
		 
		 Thread.sleep(5000);
		 driver.manage().window().maximize();
		 
		 Thread.sleep(5000);
		 WebElement email = driver.findElement(By.id("email"));
		 email.sendKeys("type your email id");
		 
		 Thread.sleep(5000);
		 WebElement password = driver.findElement(By.name("pass"));
		 password.sendKeys("type your password");
		 
		 
		 Thread.sleep(5000);
		 WebElement login = driver.findElement(By.name("login"));
		 String text = login.getText();
		 System.out.println(text);
		 
		 login.click();
		 
		 
		 
		 
	
		 
		
	}

}
