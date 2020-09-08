package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork01 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("syntax");
		driver.findElement(By.id("customer.lastName")).sendKeys("tax");
		driver.findElement(By.id("customer.address.street")).sendKeys("1111 abc Court");
		driver.findElement(By.id("customer.address.city")).sendKeys("Alexandria");
		driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("22311");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("1257896548");
		driver.findElement(By.id("customer.ssn")).sendKeys("000668574");
		driver.findElement(By.id("customer.username")).sendKeys("syntax");
		driver.findElement(By.id("customer.password")).sendKeys("123456789");
		driver.findElement(By.id("repeatedPassword")).sendKeys("123456789");
		driver.findElement(By.className("button")).click();
		
		driver.findElement(By.id("customer.username")).sendKeys("Markel");
		
		driver.findElement(By.id("customer.password")).sendKeys("apple");
		
		driver.findElement(By.id("repeatedPassword")).sendKeys("apple");
	
		driver.findElement(By.className("button")).click();
		driver.close();
		
		
		
		

	}

}
