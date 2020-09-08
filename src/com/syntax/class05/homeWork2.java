package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class homeWork2 {

	public static void main(String[] args)  throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		Thread.sleep(3000);
		
		WebElement catagoriesDD = driver.findElement(By.id("gh-shop-a"));
		Select select = new Select(catagoriesDD);
		List<WebElement> options = select.getOptions();
		options.size();
		
		for (WebElement option:options) {
			String text = option.getText();
			System.out.println(text);
			
			select.selectByValue("58058");
		}
		
		

}
}