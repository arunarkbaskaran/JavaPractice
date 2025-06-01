package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperDriver {
	static WebDriver driver;

	public static WebDriver getDriver() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElementUtils.setWebDiver(driver);
		driver.manage().window().maximize();
		return driver;
	}
}
