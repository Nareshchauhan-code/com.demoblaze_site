package demoblaze_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;
import utils.WebUtils;

public class AddItem extends BaseLibrary {

	public AddItem() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Phones']")
	WebElement clickonphones;
	@FindBy(xpath = "//a[text()='Samsung galaxy s6']")
	WebElement selectphone;
	@FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
	WebElement addtocart;
	@FindBy(xpath = "//a[text()='Home ']")
	WebElement clickonHome;
	@FindBy(xpath = "//a[text()='Nokia lumia 1520']")
	WebElement clickonNokia;

	public void addItem() throws InterruptedException {

		WebUtils.waitForVisibilityOfElement(driver, clickonphones);
		driver.navigate().refresh();
		clickonphones.click();
		WebUtils.waitForElementToBeClickable(driver, selectphone, 10);
		selectphone.click();
		WebUtils.waitForElementToBeClickable(driver, addtocart, 10);
		addtocart.click();
		WebUtils.sleep(2000);
		WebUtils.handleAlert(driver);
		WebUtils.waitForElementToBeClickable(driver, clickonHome, 10);
		clickonHome.click();
		WebUtils.waitForElementToBeClickable(driver, clickonNokia, 10);
		clickonNokia.click();
		WebUtils.waitForElementToBeClickable(driver, addtocart, 10);
		addtocart.click();
		WebUtils.sleep(2000);
		WebUtils.handleAlert(driver);
	}
}
