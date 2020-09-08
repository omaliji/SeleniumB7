package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task01 {

	public static String url = "https://www.facebook.com/r.php";
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
			
		WebElement monthsDD = driver.findElement(By.id("month"));
		Select select = new Select (monthsDD);
		
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for (int i = 0; i<size; i++) {
			select.selectByIndex(i);
		}
	
		WebElement daysDD = driver.findElement(By.id("day"));
		Select select1 = new Select (daysDD);
		
		List<WebElement> options1 = select.getOptions();
		int size1 = options.size();
		System.out.println(size);
		
		for (int i = 0; i<size; i++) {
			select.selectByIndex(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
