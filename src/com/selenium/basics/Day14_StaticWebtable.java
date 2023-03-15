package com.selenium.basics;

import java.util.List;                            //table/tbody/tr/td
import org.openqa.selenium.By;                    //table/tbody/tr[rowindex]/td
import org.openqa.selenium.WebDriver;             //table/tbody/tr/td[columnIndex]
import org.openqa.selenium.WebElement;            //table/tbody/tr[rowindiex]/td[columnindex]
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14_StaticWebtable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Sele_8Pm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();

		
		Thread.sleep(2000);//all data
		System.out.println("========all data=======");
		List<WebElement> alldata = driver.findElements(By.xpath("(//table[@id='table_id'])/tbody/tr/td")); // finding

		for (WebElement all : alldata) { // iterating
			String text = all.getText();
			System.out.println(text);

		}//only particular row
		System.out.println("=========particular row ============");

		List<WebElement> rowdata = driver.findElements(By.xpath("(//table[@id='table_id'])/tbody/tr[4]/td")); // finding

		for (WebElement row : rowdata) { // iterating
			String text1 = row.getText();
			System.out.println(text1);
		}//particular column
		System.out.println("=========particular column===========");
		List<WebElement> columndata = driver.findElements(By.xpath("(//table[@id='table_id'])/tbody/tr/td[6]")); // finding

		for (WebElement column : columndata) { // iterating
			String text2 = column.getText();
			System.out.println(text2);

		}//particular data
		System.out.println("=============particukar=====================");
		WebElement particular = driver.findElement(By.xpath("(//table[@id='table_id'])/tbody/tr[5]/td[5]")); // finding

		String text3 = particular.getText(); // no iterating due to single data
		System.out.println(text3);

		//all header
		System.out.println("=============all header============");
		List<WebElement> headerdata = driver.findElements(By.xpath("(//table[@id='table_id'])/tbody/tr/th")); // finding

		for (WebElement header : headerdata) { // iterating
			String text4 = header.getText();
			System.out.println(text4);
		}

	}

}
