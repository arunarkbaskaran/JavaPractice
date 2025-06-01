package Selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionDropDown {
	private WebDriver driver;
	private String baseUrl = "https://www.browserstack.com/users/sign_up";
	private WebElement element;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new HelperDriver().getDriver();
	}

	@Test
	public void testUntitled() throws Exception {
		WebElementUtils.loadPage(baseUrl);
		Actions ac = new Actions(driver);
		ac.dragAndDrop(WebElementUtils.findElementByXPATH("//a[text()='Sign up with Google']"),
				WebElementUtils.findElement("user_email_login")).build();
		ac.doubleClick(element).dragAndDrop(element, element).build();
		ac.keyDown(Keys.CONTROL).keyDown("C").keyUp(Keys.CONTROL);
		ac.perform();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
}
