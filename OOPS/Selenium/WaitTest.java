package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitTest {

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
		WebElementUtils.setText("user_full_name","arun");
		WebElementUtils.setText("user_email_login","arun1@gmail.com");
		WebElementUtils.setText("user_password","xxYYZZ123");
		WebElementUtils.clickBTN("user_submit");
		Thread.sleep(5000);
//		WebElementUtils.clickBTN(WebElementUtils.findElementByXPATH("//input[@name='commit' and @value='Sign me up']"));
		Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage= driver.switchTo().alert().getText(); // capture alert message
		driver.switchTo().alert().accept();
		System.out.println(alertMessage);
		Thread.sleep(5000);
		alert.accept();
		Thread.sleep(15000);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
}
