package com.selenium.basics;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//1.driver.switchTo().alert().accept(); 2.,driver.switchTo().alert().dismiss(); 3.,String text = driver.switchTo().alert().getText();
//4.driver.switchTo().alert().sendKeys("box program");
public class Day7_Alert {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//simple alert
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));                  //only selection
		s.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();                                                                //(accept)
		
		//confirm click
		Thread.sleep(2000);
		WebElement s2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));                      //first selection
		s2.click();
		Thread.sleep(2000);
		WebElement s3 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));                //second selection
		s3.click(); 
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();                                                              //(dismiss)
		
		//prompt alert
		WebElement s4 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));                      //first selection
		s4.click();	
		Thread.sleep(2000);
		WebElement s5 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));                   //second slection
		Thread.sleep(2000);
		s5.click();
		
		Thread.sleep(2000);
		String text = driver.switchTo().alert().getText();                                                 //printing get text
		System.out.println(text);
		
		
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("dhanush prompt alert box program");
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
			
		
	}

}
