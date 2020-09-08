package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxPractice {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://166.62.36.207/syntaxpractice/basic-checkbox-demo.html";

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
//		driver.findElement(By.id("user-message")).sendKeys("I love Tahmina");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text() ='Show Message' ]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("sum1")).sendKeys("50");
//		Thread.sleep(2000);
//		driver.findElement(By.id("sum2")).sendKeys("50");
//		Thread.sleep(2000);
		
		driver.findElement(By.id("isAgeSelected")).click();
		Thread.holdsLock(3000);
	

	}

}