package com.syntax.classPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddingOptiontoWebsite {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://www.uitestpractice.com/Students/Form";

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.id("firstname")).sendKeys("Johnny");
		driver.findElement(By.id("lastname")).sendKeys("ahmadjonnehy");
		driver.findElement(By.className("radio-inline")).click();
		driver.findElement(By.className("checkbox-inline")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"sel1\"]")).click();
		driver.findElement(By.id("datepicker")).sendKeys("04/10/1988");
		driver.findElement(By.id("phonenumber")).sendKeys("5719874561");
		driver.findElement(By.id("username")).sendKeys("omaliji");
		driver.findElement(By.id("email")).sendKeys("omaliji@yahoo.com");
		driver.findElement(By.id("comment")).sendKeys("Johnny is a very good and intellgent boy and he is always trying to study hard to get a good paying job");
		driver.findElement(By.id("pwd")).sendKeys("1234567890000000a");
		driver.findElement(By.linkText("Submit")).click();
		
		
		
		
		
		

	}
}