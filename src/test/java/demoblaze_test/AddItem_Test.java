package demoblaze_test;

import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import demoblaze_pages.AddItem;
import demoblaze_pages.LoginPage;

public class AddItem_Test extends BaseLibrary {

	LoginPage page;
	AddItem additem;

	@Test
	public void addItem() throws InterruptedException {

		page = new LoginPage();
		additem = new AddItem();
		page.loginPage();
		additem.addItem();

	}

}
