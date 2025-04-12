package Selenium;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
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
//		WebElementUtils.setText("user_full_name","arun");
		Actions action = new Actions(driver);
		action.dragAndDrop(WebElementUtils.findElementByXPATH("//a[text()='Sign up with Google']"),
				WebElementUtils.findElement("user_email_login")).build();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_submit")));
		File file1 = new File("D:\\Test.png");
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), file1);
		System.out.println("File Path : " + file1.getAbsolutePath());
		FluentWait fwait = new FluentWait(driver);
		fwait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5))
				.until(ExpectedConditions.elementToBeClickable(By.id("user_submit")));

		WebElementUtils.setText("user_email_login", "arun1@gmail.com");
		WebElementUtils.setText("user_password", "xxYYZZ123");
		WebElementUtils.clickBTN("user_submit");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
}
