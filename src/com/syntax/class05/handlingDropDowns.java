package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingDropDowns {

	public static void main(String[] args) {
		
		String url = "http://166.62.36.207/syntaxpractice/basic-radiobutton-demo.html";
		
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			WebElement daysDD = driver.findElement(By.id("select-demo"));
			Select select = new Select (daysDD);
			select.selectByIndex(2);

	}

}
