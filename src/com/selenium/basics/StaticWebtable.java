package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebtable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
			
		 driver.get("http://leafground.com/pages/table.html");
		 driver.manage().window().maximize();
		 
		 
		 //all data
		 System.out.println("=============all data============");
		 List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr"));
		 
         for (WebElement web1 : alldata) {
        	 String text = web1.getText();
        	 System.out.println(text);
         }
         //only row
        	 
        	 System.out.println("============only row=====================");
        	 List<WebElement> row = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr[4]/td"));
			for (WebElement ro : row) {
				String text2 = ro.getText();
				System.out.println(text2);
	
		}
		
         // only column
         System.out.println("===============only one column==============");
         System.out.println("===mentor name=====");
         List<WebElement> onecolumn = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr/td[5]"));
         
         for (WebElement col : onecolumn) {
			 String text3 = col.getText();
			 System.out.println(text3);
		}
         //particular data
         System.out.println("=================particular data ===========");
         WebElement particular = driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr[4]/td[6]"));
	
         String text4 = particular.getText();
         System.out.println(text4);
	}

}
