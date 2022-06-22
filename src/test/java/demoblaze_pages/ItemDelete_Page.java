package demoblaze_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class ItemDelete_Page extends BaseLibrary {

	public ItemDelete_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "cartur")
	WebElement clickoncart;
	@FindBy(xpath = "//a[text()='Delete']")
	WebElement clickdelete;

	public void deleteItem() {
		clickoncart.click();
		clickdelete.click();
	}
}
