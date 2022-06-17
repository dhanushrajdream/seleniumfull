package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_Frame {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver1\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		 
		driver.switchTo().frame("SingleFrame");                                               //switching to single frame
	
			
		WebElement fa = driver.findElement(By.xpath("//input[@type='text']"));               //finding the text box
		fa.sendKeys("dhanush frames program"); 
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();                                                   //returning back to deafult page
		
		
		
		WebElement fa1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));        //finding the second box
		fa1.click();
		
		
		WebElement outer = driver.findElement(By.xpath("(//iframe[@src='MultipleFrames.html'])[1]"));     // iframe outer 
		Thread.sleep(5000);
		driver.switchTo().frame(outer);
		
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html'][1]"));
		Thread.sleep(3000);
		driver.switchTo().frame(inner);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));                           //finding text box
		
		                                                                                                    //swtching to text 
		Thread.sleep(2000);
		textbox.sendKeys("paravala selnium easya than eruku");
		
		
		
		
		
		
		
		
		
		
		
	}

}
