package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainBrowserQuit {
   public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver();

      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

      System.out.println( "Browser title after launch: " + driver.getTitle());
      System.out.println( "Browser title after launch: " + driver.getTitle());

      driver.quit();
   }
}