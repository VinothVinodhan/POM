package testSuite;

import org.openqa.selenium.WebDriver;
import browsers.ChooseBrowser;
import pages.Login;
import pages.LoginwithoutPageFactory;

public class TestCasewithPageFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Webdriver is static one called from ChooseBrowser class
		// we defined as Static, so no need to create a object
		// directly we can call.
		// i.e, ChooseBrowser.selectBro
		// here ChooseBrowser is a class, selectBro is method
		WebDriver d = ChooseBrowser.selectBro("chrome", "http://newtours.demoaut.com/");
		LoginwithoutPageFactory tc = new LoginwithoutPageFactory(d);
		Login LG = new Login(d);
		tc.regClick();
		tc.datafield();
		LG.regClick();
	}
}