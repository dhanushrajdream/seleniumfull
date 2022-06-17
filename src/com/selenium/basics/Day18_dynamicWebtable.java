package com.selenium.basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18_dynamicWebtable {
	static int indexofTotal,indexofRecoveredd,indexofTotcases_1m;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver1\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.worldometers.info/coronavirus/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		 
		 for (int i = 0; i < allHeaders.size(); i++) {                                                                    //Opening for loop
			 String text = allHeaders.get(i).getText();
			 //System.out.println(text);
			 String header = text.replaceAll("\n", "  ");
			 System.out.println(header);
			 
			 //finding the index of the header
			 
			 if(header.equalsIgnoreCase("Total  Cases")) {                                                               
				 indexofTotal =i;
				 System.out.println("Index of total cases: "+indexofTotal);
			 }
			
			 if(header.equalsIgnoreCase("Total  Recovered")) {
			   indexofRecoveredd =i;
			   System.out.println("Index of Total Recovered: "+indexofRecoveredd);
			   
			 }
			 if (header.equalsIgnoreCase("Tot Cases/  1M pop")) {
				 indexofTotcases_1m =i;
				 System.out.println("print hte index of tot cases for 1  million;"+indexofTotcases_1m);
			}                                                                                                             //if block clossing there it self
		 }                                                                                                                //end of for loop
		 
		 //transverse into body to to find the rows
		 
		 List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));
		 
	     //iterate row
		 
          for (int i = 0; i < allrows.size(); i++) {
			  List<WebElement> findingrows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr/td"));
			  
		  //iterating by column	   
			  for (int j = 0; j < findingrows.size(); j++) {
				  if (findingrows.get(j).getText().equalsIgnoreCase("India")) {
					  System.out.println("total cases:"+findingrows.get(indexofTotal).getText());
					  System.out.println("total recovered: "+findingrows.get(indexofRecoveredd).getText());
					  System.out.println("tot cases: "+findingrows.get(indexofTotcases_1m).getText());

					
     
	    }
				
	   }
	  }	 
		 	 
	     //overall sclosing
		 
	 }	
	}


