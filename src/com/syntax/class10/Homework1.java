package com.syntax.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

public static void main(String[] args) throws InterruptedException {
		
		String url = "https://artoftesting.com/samplesiteforselenium";
		
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
//			WebElement link = driver.findElement(By.linkText("This is a link"));
//			link.click();
			Thread.sleep(1000);
			WebElement textBox = driver.findElement(By.xpath("//input[@id = 'fname']"));
			Thread.sleep(1000);
			textBox.sendKeys("Omar is the best and intellgent boy in Batch 7!!!");
			Thread.sleep(1000);
			WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id = 'idOfButton']"));
			Thread.sleep(1000);
			SubmitBtn.click();
			Thread.sleep(1000);
			WebElement DblClkBtn = driver.findElement(By.id("dblClkBtn"));
			Thread.sleep(2000);
			DblClkBtn.click();
			
			
}
}