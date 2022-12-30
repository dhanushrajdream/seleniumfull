package com.selenium.basics;

import org.openqa.selenium.By;                         //driver.switchTo().frame("SingleFrame");
import org.openqa.selenium.WebDriver;                  //driver.switchTo().defaultContent();
import org.openqa.selenium.WebElement;                 //driver.switchTo().frame(outer);
import org.openqa.selenium.chrome.ChromeDriver;        //driver.switchTo().frame(inner);
                                                       //driver.switchTo().defaultContent(); 
public class Day8_Frame {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//switching to single frame
		Thread.sleep(2000);
		driver.switchTo().frame("SingleFrame");                                               
	
		//finding the text box inside the frame
		WebElement fa = driver.findElement(By.xpath("//input[@type='text']"));               
		fa.sendKeys("dhanush frames program"); 
		
		Thread.sleep(5000);
		//driver.switchTo().defaultContent();                                                            //returning back to default page
		
		//finding the second box(heading box)
		WebElement fa1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));        
		fa1.click();
		
		//iframe within iframe (nested i frame)
		WebElement outer = driver.findElement(By.xpath("(//iframe[@src='MultipleFrames.html'])[1]"));     // iframe outer 
		Thread.sleep(5000);
		driver.switchTo().frame(outer);
		
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html'][1]"));         //iframe inner
		Thread.sleep(3000);
		driver.switchTo().frame(inner);
		
		//finding text box
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));                           
		                                                                                                     
		Thread.sleep(2000);
		textbox.sendKeys("paravala selnium easya than eruku");                                           //switching to text

		
	}

}
