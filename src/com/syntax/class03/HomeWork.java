package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) throws InterruptedException {

		// Click on start practicing button
		// Click on proceed next button
		// Click on “Input form validations”
		// Fill out the form and click on send -- skip - drop down for state and radio
		// button
		// Please use CSS and XPath for this task

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/index.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a#btn_basic_example")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text() = 'Simple Form Demo'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder^= 'Please enter']")).sendKeys("batch 7 rock!!!");
		driver.findElement(By.xpath("//button[text() ='Show Message' ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id, 'sum1')]")).sendKeys("25");
		driver.findElement(By.cssSelector("input#sum2")).sendKeys("25");
		driver.findElement(By.cssSelector("button[onclick $='()']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id, 'btn_basic_example')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id ='btn_inter_example']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(), 'Validations')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='first']")).sendKeys("MOH");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name^='last']")).sendKeys("jon");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder *='E-']")).sendKeys("vcw@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with@name, 'pho')]")).sendKeys("7894561234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("7890 street");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name, 'city')]")).sendKeys("Alexandria");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("22311");
		driver.findElement(By.xpath("//button[contains@onclick,'form();']")).click();
		Thread.sleep(4000);
		driver.quit();
		
		
		
		

	}

}
