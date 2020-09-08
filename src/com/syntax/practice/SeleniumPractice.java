package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

public static void main(String[] args) throws InterruptedException {
		
		String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			WebElement userName = driver.findElement(By.id("txtUsername"));
			Thread.holdsLock(2000);
			WebElement passWord = driver.findElement(By.id("txtPassword"));
			Thread.sleep(2000);
			WebElement signIn = driver.findElement(By.id("btnLogin"));
			
			userName.sendKeys("Admin");
			passWord.sendKeys("1234567890");
			signIn.click();
			
			 driver.findElement(By.id("spanMessage")).getText();
			 String ErrorText = driver.getCurrentUrl();

}
}