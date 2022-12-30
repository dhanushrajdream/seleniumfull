package com.seleniumfullpdf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Number_Link_In_Google_Page {
	
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.get("https://www.facebook.com/DhanushKRaja/");
		
		driver.manage().window().maximize();
		List<WebElement> x = driver.findElements(By.tagName("a"));
		// To find the count of the link
		System.out.println(x.size());
		// To print all links
		for (WebElement x1 : x) {
		System.out.println(x1.getAttribute("href"));
		}
		}


}
