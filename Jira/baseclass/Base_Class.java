package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;
import javax.swing.text.html.Option;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver browser_Launch(String name) {
		if (name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\madhu\\eclipse-workspace\\Cucumber_Adactin\\Driver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("incognito");

			driver = new ChromeDriver(options);
		} else if (name.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\madhu\\eclipse-workspace\\Cucumber_Adactin\\Driver\\msedgedriver.exe");

			EdgeOptions options = new EdgeOptions();
			options.addArguments("incognito");

			driver = new EdgeDriver(options);
		}
		return driver;

	}

	
	
	public static  void sleep() throws InterruptedException {
Thread.sleep(10000);
	}
//WEBDRIVER METHODS-----------------------------------------------------------------
	public static void url(WebDriver driver, String URL) {
		driver.get(URL);
	}

	public static void title(WebDriver driver) {
		driver.getTitle();
	}

	public static void currenturl(WebDriver driver) {
		driver.getCurrentUrl();
	}

	public static void pagesource(WebDriver driver) {
		driver.getPageSource();
	}

	public static void close(WebDriver driver) {
		driver.close();
	}

	public static void quit(WebDriver driver) {
		driver.quit();
	}

	public static void navigate_To(WebDriver driver, String url) {
		driver.navigate().to(url);
	}

	public static void navigate_Back(WebDriver driver) {
		driver.navigate().back();
	}

	public static void navigate_Forward(WebDriver driver) {
		driver.navigate().forward();
	}

	public static void navigate_Refresh(WebDriver driver) {
		driver.navigate().refresh();
	}

	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void fullscreen(WebDriver driver) {
		driver.manage().window().fullscreen();
	}

	public static void get_Size(WebDriver driver) {
		driver.manage().window().getSize();

	}

	public static void implicit_Wait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void set_Size(int x, int y, WebDriver size) {
		Dimension d = new Dimension(x, y);
		size.manage().window().setSize(d);
	}

	public static void switch_Alert_ok(WebDriver driver, WebElement element) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void switch_Alert_cancel(WebDriver driver, WebElement element) {
		Alert a = driver.switchTo().alert();
		a.dismiss();

	}

	public static void switch_Frame_Index(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public static void switch_Frame_Id(WebDriver driver, String id) {
		driver.switchTo().frame(id);
	}

	public static void switch_Frame_Webelement(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void switch_Frame_Parent(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

	public static void switch_Frame_Ownpage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public static void switch_Single_Window(WebDriver driver) {
		String parent_Id = driver.getWindowHandle();
		Set<String> all_Id = driver.getWindowHandles();
		for (String id : all_Id) {
			if (id.equals(parent_Id)) {

				continue;
			} else {
				driver.switchTo().window(id);
			}
		}
	}
//WEBELEMENT METHODS------------------------------------------------------------------------

	public static void click(WebElement element) {
		element.click();
	}

	public static void send_Keys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void Clear(WebElement element) {
		element.clear();
	}

	public static void get_Text(WebElement element) {
		element.getText();
	}

	public static void is_Displayed(WebElement element) {
		element.isDisplayed();
	}

	public static void is_Enabled(WebElement element) {
		element.isEnabled();
	}

	public static void is_Selected(WebElement element) {
		element.isSelected();
	}

	public static void get_Attribute(WebElement element, String value) {
		element.getAttribute(value);
	}

	public static void get_Tagname(WebElement element) {
		element.getTagName();
	}

	public static void get_Location(WebElement element) {
		element.getLocation();
	}

	public static void get_Size(WebElement element) {
		element.getSize();
	}

	public static void get_Cssvalue(WebElement element, String value) {
		element.getCssValue(value);
	}

	public static void get_Rectangle(WebElement element) {
		element.getRect();
	}

	public static void is_Multiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	public static void select_Index(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void select_Value(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void select_Text(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void deselect_Index(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);

	}

	public static void deselect_Value(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public static void deselect_Text(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public static void select_First_Option(WebElement element) {
		Select s = new Select(element);
		s.getFirstSelectedOption();
	}

	public static void select_Get_Options(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options);
		}
	}

	public static void select_Get_Allselected(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement all : allSelectedOptions) {
			System.out.println(all);
		}
	}
	// ACTIONS---------------------------------------------------------------------------------
	// MOUSE
	// ACTIONS------------------------------------------------------------------------------------

	public static void left_Click(WebDriver driver) {
		Actions a = new Actions(driver);
		a.click().build().perform();
	}

	public static void right_Click(WebDriver driver) {
		Actions a = new Actions(driver);
		a.contextClick().build().perform();
	}

	public static void right_Click_Element(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}

	public static void double_Click(WebDriver driver) {
		Actions a = new Actions(driver);
		a.doubleClick().build().perform();
	}

	public static void double_Click_element(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}

	public static void move_To_Element(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element);
	}

	public static void down() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}
	public static void snap(WebDriver driver) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File des = new File(
				"C:\\Users\\madhu\\eclipse-workspace\\Cucumber_Adactin\\Screenshot\\bookhotel.png");
		FileUtils.copyFile(source, des);

	}
}
