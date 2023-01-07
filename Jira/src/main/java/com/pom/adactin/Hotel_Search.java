package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Search {

	public WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement Location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotel;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement room;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement room_No;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement check_In;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement check_Out;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child;

	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement search_Btn;

	public Hotel_Search(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2,this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoom_No() {
		return room_No;
	}

	public WebElement getCheck_In() {
		return check_In;
	}

	public WebElement getCheck_Out() {
		return check_Out;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch_Btn() {
		return search_Btn;
	}
}