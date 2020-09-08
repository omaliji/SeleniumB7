package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
				driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
				driver.findElement(By.className("ctl00$MainContent$password")).sendKeys("test");
				driver.findElement(By.className("button")).click();
				
				String title = driver.getTitle();
				if(title.equalsIgnoreCase("Web Orders")) {
					
			

	}

}
}
