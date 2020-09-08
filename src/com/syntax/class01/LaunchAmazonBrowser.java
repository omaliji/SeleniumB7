package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazonBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-search-keywords")).click();
		
		
		
		
		
		
//		Thread.sleep(3000);
//		driver.findElement(By.id("email")).sendKeys("mohammadomar29@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.id("pass")).sendKeys("Manila123");
//		Thread.sleep(3000);
//		driver.findElement(By.id("u_0_b")).click();
//		Thread.sleep(3000);
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		if(title.equalsIgnoreCase("Facebook = Log in or sign up")) {
//			System.out.println("The title is correct");
//		}else {
//			System.out.println("The title is wrong");
//		}
//		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		

	}

}
