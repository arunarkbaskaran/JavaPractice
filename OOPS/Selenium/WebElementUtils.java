package Selenium;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementUtils {
	public static WebDriver mDriver;

	public static void setWebDiver(WebDriver driver) {
		mDriver = driver;
	}

	public static void loadPage(String sBaseURL) {
		mDriver.get(sBaseURL);
	}

	public static boolean selectDropDown(String sDropDownlocator, String sOption) {
		WebElement select = findElement(sDropDownlocator);
		boolean status = false;
		if (select == null) {
			System.out.println("Dropdown Not Found!");
			status = false;
		} else if (select.isDisplayed() && select.isEnabled()) {

			Select dropdown = new Select(select);
			if (!dropdown.getOptions().isEmpty() && dropdown.getOptions().contains(sOption)) {
				dropdown.selectByValue(sOption);
				status = true;
			} else {
				System.out.println("Dropdown Not Found!");
				status = false;
			}
		}
		return status;

	}

	public static WebElement findElementByXPATH(String searchItem) {
		WebElement element = null;
		try {
			element = mDriver.findElement(By.xpath(searchItem));
		} catch (NoSuchElementException e1) {
			System.err.println("Element Not Found");
		}
		return element;

	}

	public static WebElement findElement(String searchItem) {
		WebElement element = null;
		try {
			element = mDriver.findElement(By.id(searchItem));
		} catch (NoSuchElementException e) {
			try {
				element = mDriver.findElement(By.xpath(searchItem));
			} catch (NoSuchElementException e1) {
				try {
					element = mDriver.findElement(By.className(searchItem));
				} catch (NoSuchElementException e2) {
					try {
						element = mDriver.findElement(By.cssSelector(searchItem));
					} catch (NoSuchElementException e3) {
						try {
							element = mDriver.findElement(By.linkText(searchItem));
						} catch (NoSuchElementException e4) {
							try {
								element = mDriver.findElement(By.tagName(searchItem));
							} catch (NoSuchElementException e5) {
								try {
									element = mDriver.findElement(By.partialLinkText(searchItem));
								} catch (NoSuchElementException e6) {
									try {
										element = mDriver.findElement(By.name(searchItem));
									} catch (NoSuchElementException e7) {
										element = null;
									}

								}
							}
						}

					}

				}
			}
		}
		return element;

	}

	public List<WebElement> findElements(String searchItem) {
		List<WebElement> elements = null;
		try {
			elements = mDriver.findElements(By.id(searchItem));
		} catch (NoSuchElementException e) {
			try {
				elements = mDriver.findElements(By.xpath(searchItem));
			} catch (NoSuchElementException e1) {
				try {
					elements = mDriver.findElements(By.className(searchItem));
				} catch (NoSuchElementException e2) {
					try {
						elements = mDriver.findElements(By.cssSelector(searchItem));
					} catch (NoSuchElementException e3) {
						try {
							elements = mDriver.findElements(By.linkText(searchItem));
						} catch (NoSuchElementException e4) {
							try {
								elements = mDriver.findElements(By.tagName(searchItem));
							} catch (NoSuchElementException e5) {
								try {
									elements = mDriver.findElements(By.partialLinkText(searchItem));
								} catch (NoSuchElementException e6) {
									try {
										elements = mDriver.findElements(By.name(searchItem));
									} catch (NoSuchElementException e7) {
										elements = null;
									}

								}
							}
						}

					}

				}
			}
		}
		return elements;

	}

	public static boolean setText(String inputField, String sText) {
		boolean status = false;
		WebElement inputElement = findElement(inputField);
		if (inputElement != null) {
			inputElement.sendKeys(sText);
			status = true;
		} else {
			System.err.println("Element Not Found!");
			status = false;
		}
		return status;

	}

	public static boolean clickBTN(String btnName) {
		boolean status = false;
		WebElement inputElement = findElement(btnName);
		if (inputElement != null) {
			inputElement.click();
			status = true;
		} else {
			System.err.println("Element Not Found!");
			status = false;
		}
		return status;

	}

	public static boolean clickBTN(WebElement element) {
		boolean status = false;
		if (element != null) {
			element.click();
			status = true;
		} else {
			System.err.println("Element Not Found!");
			status = false;
		}
		return status;

	}
}
