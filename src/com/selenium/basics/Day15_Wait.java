package com.selenium.basics;

import java.util.NoSuchElementException; 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day15_Wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("dhanush account da");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("pass wordlam solla mudiyathu poda");

		// explicit wait search for examples online
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(pass));

		// fluent wait
		// Declare and initialise a fluent wait
		FluentWait fwait = new FluentWait(driver);
		// Specify the timout of the wait
		fwait.withTimeout(5000, TimeUnit.MILLISECONDS);
		// Sepcify polling time
		fwait.pollingEvery(250, TimeUnit.MILLISECONDS);
		// Specify what exceptions to ignore
		fwait.ignoring(NoSuchElementException.class);
		// This is how we specify the condition to wait on.
		// This is what we will explore more in this chapter
		wait.until(ExpectedConditions.alertIsPresent());

	}

}
