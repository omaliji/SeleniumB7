package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork01 {

	public static void main(String[] args)  throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_n")).sendKeys("John");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_p")).sendKeys("Maali");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("5714567890");
		Thread.sleep(3000);
		driver.findElement(By.id("password_step_input")).sendKeys("1234567890@");
		Thread.sleep(3000);
		WebElement monthsDD = driver.findElement(By.id("month"));
		Thread.sleep(3000);
		Select selectMonth = new Select (monthsDD);
		Thread.sleep(3000);
		selectMonth.selectByIndex(12);
		Thread.sleep(3000);
		Select selectDay = new Select(driver.findElement(By.id("day")));
		Thread.sleep(3000);
		selectDay.selectByValue("20");
		Thread.sleep(3000);
		WebElement yearDD = driver.findElement(By.id("year"));
		Thread.sleep(3000);
		Select selectYear = new Select(yearDD);
		Thread.sleep(3000);
		selectYear.selectByVisibleText("1990");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_7")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_14")).click();
		Thread.sleep(3000);
				
		
	}

}
