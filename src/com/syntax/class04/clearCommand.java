package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearCommand {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			WebElement userNameTextBox =driver.findElement(By.id("ctl00_MainContent_username"));
			userNameTextBox.sendKeys("Tester");
			
			WebElement passwordTextBox =driver.findElement(By.id("ctl00$MainContent$password"));
			passwordTextBox.sendKeys("test");
			Thread.sleep(2000);
			
			userNameTextBox.clear();
			passwordTextBox.clear();
			
			
			

	}

}
