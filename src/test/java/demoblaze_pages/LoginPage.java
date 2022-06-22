package demoblaze_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;
import utils.WebUtils;

public class LoginPage extends BaseLibrary {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login2")
	WebElement Loginbtn;
	@FindBy(id = "loginusername")
	WebElement username;
	@FindBy(id = "loginpassword")
	WebElement password;
	@FindBy(xpath = "//button[@onclick='logIn()']")
	WebElement clickonloginbtn;

	public void loginPage() {
		Loginbtn.click();
		WebUtils.waitForVisibilityOfElement(driver, username);
		username.sendKeys("shishondia@gmail.com");
		password.sendKeys("aryan@123");
		clickonloginbtn.click();
	}

}
