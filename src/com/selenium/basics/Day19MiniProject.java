package com.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day19MiniProject {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement usernamefind = driver.findElement(By.id("username"));                     //username typing
        usernamefind.sendKeys("dhanush5");
        
        WebElement password = driver.findElement(By.id("password"));                         //password typing
        password.sendKeys("dhanush5");
        
        Thread.sleep(5000);
        WebElement login = driver.findElement(By.id("login"));                               //login button
        login.click();
	
        Thread.sleep(3000);
        WebElement location = driver.findElement(By.name("location"));                      // location
        Select s = new Select(location); 
        s.selectByValue("Paris");
        
        WebElement hotels = driver.findElement(By.id("hotels"));                             //hotel name
        Select h = new Select(hotels);
        h.selectByVisibleText("Hotel Sunshine");
        
        WebElement roomtype = driver.findElement(By.id("room_type"));                        //room type
	    Select r = new Select(roomtype);  
	    r.selectByIndex(4);
	    
	    WebElement roomsnumber = driver.findElement(By.id("room_nos"));                      //number of rooms
	    Select n = new Select(roomsnumber);
	    n.selectByIndex(5);
	    
	    
	    WebElement fromdate = driver.findElement(By.id("datepick_in"));                      //fromdate in hotel
	    fromdate.clear();
	    fromdate.sendKeys("25/03/2022");
	    
	    WebElement todate = driver.findElement(By.id("datepick_out"));                       //todate
	    todate.clear();
	    todate.sendKeys("27/03/2022");
	    
	  
	    WebElement people = driver.findElement(By.id("adult_room"));                         //people in rooms
	    Select p = new Select(people);
	    p.selectByValue("4");
	    
	    WebElement childrooms = driver.findElement(By.id("child_room"));                     //child in rooms
	    Select c = new Select(childrooms);
	    c.selectByIndex(4);
	    
	    WebElement searchbutton = driver.findElement(By.id("Submit"));                       //search option
	    searchbutton.click();
	    
	    WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));                 //radiobutton
        radiobutton.click();
        
       
        WebElement cont = driver.findElement(By.id("continue"));                             //continue button
        cont.click();
        
        WebElement firstname = driver.findElement(By.name("first_name"));                    //first name
        firstname.sendKeys("dhanush"); 
        
        WebElement lastname = driver.findElement(By.name("last_name"));                      //last name
        lastname.sendKeys("raj");
         
        WebElement billing = driver.findElement(By.name("address"));                          //billing adress
        billing.sendKeys("chennai");
        
        WebElement ccnumber = driver.findElement(By.name("cc_num"));                           //credit card number
        ccnumber.sendKeys("1234567898745632");
        
        WebElement cctype = driver.findElement(By.name("cc_type"));                            //credit card type
        Select cc = new Select(cctype);
        cc.selectByValue("VISA");
        
        WebElement expiremonth = driver.findElement(By.name("cc_exp_month"));                  //cc expire month
        Select expirem = new Select(expiremonth);
        expirem.selectByValue("5");
        
        WebElement expireyear = driver.findElement(By.name("cc_exp_year"));                     //cc expire year
        Select expirey = new Select(expireyear);
        expirey.selectByValue("2022");
        
        WebElement cvvnumber = driver.findElement(By.name("cc_cvv"));                          //cvv number
        cvvnumber.sendKeys("555");
        
        WebElement lastbooking = driver.findElement(By.name("book_now"));                     //booknow button
        lastbooking.click();
        
        Thread.sleep(10000);
        
        WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));             // final logout button
        logout.click(); 
        
        
        
 
        Thread.sleep(10000);	
 	    driver.close();
	}
}
