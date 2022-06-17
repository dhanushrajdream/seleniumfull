package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Browser_launch {
	public static void main(String[] args) throws InterruptedException {
		//property setup
		//key --->driver name
		// value -->path
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe ");
		
		// browser launch
		
		 WebDriver driver = new ChromeDriver();  //upcasting
		 //interface            //class
		 //parent               //child
		 
		 driver.get("https://www.youtube.com/");
		 
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.facebook.com/");
		 
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.navigate().back();
		 
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl); 
		 
		   Thread.sleep(2000);
		   driver.navigate().back();
		   Thread.sleep(2000);
		   driver.navigate().forward();
		   Thread.sleep(2000);
		   driver.navigate().refresh();
		   
		   
		   
		   
		   Thread.sleep(2000);
		   driver.close();
		 
		
		 
		 
		 
		 
		 
		 
				
	}

}
