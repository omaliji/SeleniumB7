package com.syntax.class05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement link = driver.findElement(By.id("tabButton"));
		link.click();
		WebElement paragraph = driver.findElement(By.cssSelector("#sampleHeading"));
		String text = paragraph.getText();
		System.out.println(text);
	
	

	}

}
