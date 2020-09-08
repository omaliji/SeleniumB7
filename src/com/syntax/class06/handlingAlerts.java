package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingAlerts {
	
public static void main(String[] args) {
		
		String url = "http://166.62.36.207/syntaxpractice/basic-radiobutton-demo.html";
		
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
		

}
}