package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement first_Name;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement last_Name;
	@FindBy(xpath = "(//textarea[@id='address'])")
	private WebElement bill_Address;
	@FindBy(xpath = "(//input[@type='text'])[13]")
	private WebElement card;
	@FindBy(xpath = "//select[contains(@name,'type')]")
	private WebElement card_Type;
	@FindBy(xpath = "//select[contains(@name,'month')]")
	private WebElement month;
	@FindBy(xpath = "//select[contains(@name,'year')]")
	private WebElement year;
	@FindBy(xpath = "//input[contains(@name,'cvv')]")
	private WebElement cvv;
	@FindBy(xpath = "//input[@type='button']")
	private WebElement book_Btn;
	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirst_Name() {
		return first_Name;
	}
	public WebElement getLast_Name() {
		return last_Name;
	}
	public WebElement getBill_Address() {
		return bill_Address;
	}
	public WebElement getCard() {
		return card;
	}
	public WebElement getCard_Type() {
		return card_Type;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook_Btn() {
		return book_Btn;
	}

}
