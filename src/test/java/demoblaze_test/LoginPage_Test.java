package demoblaze_test;

import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import demoblaze_pages.LoginPage;

public class LoginPage_Test extends BaseLibrary {
	LoginPage page;

	@Test
	public void addItem() {
		page = new LoginPage();
		page.loginPage();
	}

}
