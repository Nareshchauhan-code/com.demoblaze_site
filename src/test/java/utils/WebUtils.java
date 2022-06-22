package utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtils {

	public static void screeShot(WebDriver driver) throws IOException {
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File srcFile = takescreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\ScreenShot\\additem.jpg"));

	}

	static WebDriverWait wait;

	public static void waitForVisibilityOfElement(WebDriver driver, WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForElementToBeClickable(WebDriver driver, WebElement element, int second) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(second));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void scrollPage(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void handleAlert(WebDriver driver) {

		Alert art = driver.switchTo().alert();

		art.accept();

	}

	public static void sleep(int second) throws InterruptedException {

		Thread.sleep(second);
	}
}
