package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Browser_Launch1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/");
		
		
		String u = driver.getCurrentUrl();
		System.out.println(u); 
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		String t = driver.getTitle();
		System.out.println(t);
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
	    //driver.close();
	    driver.quit();
		
	}

}
