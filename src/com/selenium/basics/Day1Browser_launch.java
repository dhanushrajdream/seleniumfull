package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Browser_launch {
	public static void main(String[] args) throws InterruptedException {
		
		//property setup
		//key --->driver name
		//value -->path
		
		//Driver name(Webdriver.chrome.driver,webdriver.ie.driver,webdriver.gecko.driver)
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe ");//file name(IEDriverServer.exe,geckodriver.exe)
		
		 //browser launch
		
		 WebDriver driver = new ChromeDriver();  //upcasting   //class name(InternetExplorerDriver(),FirefoxDriver())
		 //interface            //class                        
		 //parent               //child
		 
		 	
	     driver.get("https://www.youtube.com/");
		 
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.facebook.com/"); //to function
		 
		 //get title
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 //back
		 Thread.sleep(2000);
		 driver.navigate().back();
		 
		 //current url
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl); 
		 
		   Thread.sleep(2000);
		   driver.navigate().back();
		   Thread.sleep(2000);
		   driver.navigate().forward();
		   Thread.sleep(2000);
		   driver.navigate().refresh();
		   
		   
		   
		   
		   
		   
		   Thread.sleep(5000);
		   driver.close();
		 
		
		 
		 
		 
		 
		 
		 
				
	}

}
