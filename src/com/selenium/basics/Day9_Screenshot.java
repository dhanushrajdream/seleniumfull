package com.selenium.basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9_Screenshot {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/channel/UCPIU0ltVBYShTkiW3jTjhCg");
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		TakesScreenshot ts =(TakesScreenshot) driver;                                                             //narrowing type casting
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Screenshot\\dh.png");
		FileUtils.copyFile(source, target);
		
		Thread.sleep(2000);
		
		driver.navigate().back();                                                                                 //second screenshot trying
		File s = ts.getScreenshotAs(OutputType.FILE);
		File t = new File("C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Screenshot\\dh1.png");
		FileUtils.copyFile(s, t);
		
	}

}
