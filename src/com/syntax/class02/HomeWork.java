package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("Web Orders")) {
			System.out.println("The title is correct");
		} else {
			System.out.println("The title is wrong");
		}
		System.out.println(title);
		driver.findElement(By.linkText("Logout")).click();
		
		for (String string : args) {
			
		}

	}

}
