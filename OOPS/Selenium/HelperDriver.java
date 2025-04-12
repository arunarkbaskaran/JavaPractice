package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium.WebElementUtils;

public class HelperDriver {
	static WebDriver driver;

	public static WebDriver getDriver() {
		driver = new ChromeDriver();
		WebElementUtils.setWebDiver(driver);
		return driver;
	}
	
}
