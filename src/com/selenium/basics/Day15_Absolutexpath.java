package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15_Absolutexpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
			
		 driver.get("https://www.instagram.com/?hl=en");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 WebElement email = driver.findElement(By.xpath("/html/body/div/section/main/article/div[2]/div/div/form/div/div[1]/div/label/input"));
		 email.sendKeys("cognizant interview");
	}

}
