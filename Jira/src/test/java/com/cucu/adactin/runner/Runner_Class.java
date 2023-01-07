package com.cucu.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import com.baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src\\test\\java\\com\\cucuadactin\\feature\\Adactin.feature",
	glue = "com.stepdefinition",monochrome = true,dryRun = false,plugin = {"html:Report/rep.html","pretty"}
	
	)
	
public class Runner_Class {
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void start() {
		driver = Base_Class.browser_Launch("chrome");
		Base_Class.maximize(driver);
	}
	
	
	
	
	@AfterClass
	public static void end() throws IOException, InterruptedException {
		Base_Class.snap(driver);
	   Thread.sleep(2000);
		driver.close();
	}
	
	}
	

	
