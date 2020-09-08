package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonAutomationTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Jonnhy");
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).getText());
		
		

	}

}
