package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadDemo {
	
public static void main(String[] args) {
		
		String url = "http://the-internet.herokuapp.com/";
		
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			WebElement fileUpload =  driver.findElement(By.linkText("File Upload"));
			fileUpload.click();
			WebElement chooseFile = driver.findElement(By.id("file-upload"));
			chooseFile.sendKeys("C://Users//moham//OneDrive//Desktop/Education Form.pdf");
			WebElement submitBtn = driver.findElement(By.id("file-submit"));
			submitBtn.click();

}
}