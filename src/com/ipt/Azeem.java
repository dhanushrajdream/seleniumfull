package com.ipt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Azeem {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://tamilglitz.in/bigg-boss-tamil-vote/");
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				List<WebElement> allname = driver.findElements(By.xpath("//span[@role='group']"));
				
				 for (int i = 0; i < allname.size(); i++) {                                                              //Opening for loop
					 String text = allname.get(i).getText();
					 //System.out.println(text);
					 //String header = text.replaceAll("\n", "  ");
					 System.out.println(text);
					 
					if (text.equalsIgnoreCase("Azeem")) {
						System.out.println("hii");
						
					} else {

					}
				 }
	}

}
