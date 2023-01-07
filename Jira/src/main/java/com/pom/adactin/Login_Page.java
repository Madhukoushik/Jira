package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement user_Name;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement log_btn;
	
	public WebDriver getDriver() {
		return driver;
	}

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	

	
	public WebElement getUser_Name() {
		return user_Name;
	}

	

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog_btn() {
		return log_btn;
	}


}