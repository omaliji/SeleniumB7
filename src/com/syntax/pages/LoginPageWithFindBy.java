package com.syntax.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.syntax.Utils.BaseClass;

public class LoginPageWithFindBy extends BaseClass {

	@FindBy(id = "txtUsername")
	public WebElement userNametextBox;
	
	@FindBy(xpath = "//input[@id = 'txtPassword']")
	public WebElement passwordTextBox;
	
	@FindBy(css = "input#btnLogin")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr")
	public List<WebElement> table;

}
