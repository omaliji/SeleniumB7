package com.syntax.class09;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTablesWithPagination {

	public static String url = "http://syntaxtechs.com/selenium-practice/table-pagination-demo.php";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/section/div"));
		WebElement next = driver.findElement(By.xpath("//*[@id=\"myPager\"]/li[5]/a"));
		boolean flag = true;
		
		while (flag) {
			 for (WebElement row:rows) {
				 String rowText = row.getText();
				 if(rowText.contains("Archy J")) {
					 flag = false;
					 System.out.println(rowText);
					 break;
				 }
			 }
			 next.click();
			
		}
		
}
}