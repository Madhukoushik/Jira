package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public WebDriver driver;
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radio_btn;
	
	@FindBy(xpath = "//input[@type='submit']") 
	private WebElement Submit_Btn;

	public Select_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2,this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadio_btn() {
		return radio_btn;
	}

	public WebElement getSubmit_Btn() {
		return Submit_Btn;
	}
	
	
	
}
