package com.selenium.basics;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Select d = new Select(day);  1.selectByValue,2.selectByVisibleText,3.selectByIndex

public class Day5_SingleDropDown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
			
		Thread.sleep(2000);
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));     //create new account button
		create.click();
		
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.name("firstname"));                      //firstname
		name.sendKeys("dhanush");
		
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.name("lastname"));                   //lastname
		lastname.sendKeys("selemium");
		
		Thread.sleep(2000); 
		WebElement email = driver.findElement(By.name("reg_email__"));                   //email id
		email.sendKeys("email id ella");
		
		Thread.sleep(2000);
		WebElement newpassword = driver.findElement(By.name("reg_passwd__"));            //password
		newpassword.sendKeys("nopassword");
		
		//day
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));                               //day in dob
		
		Select d = new Select(day);                                                      //new syntax for select method
		d.selectByIndex(4);
		
		//month
		Thread.sleep(2000);                                                              //month in dob
		WebElement month = driver.findElement(By.id("month"));
		
		Select m = new Select(month);
		m.selectByVisibleText("Jan");
		
		
		//year
		Thread.sleep(2000);                                                                //year
		WebElement year = driver.findElement(By.id("year"));
				
		Select y = new Select(year);
		y.selectByIndex(24);
		
		//gender 
		Thread.sleep(2000);                                                                //gender
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		
		//signup
		Thread.sleep(2000);                                                                //sigup
		WebElement signup = driver.findElement(By.name("websubmit"));
		signup.click();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
