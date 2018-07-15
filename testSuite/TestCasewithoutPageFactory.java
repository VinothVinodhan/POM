package testSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import browsers.ChooseBrowser;
import pages.LoginwithPageFactory;

public class TestCasewithoutPageFactory {

	public static void main(String[] args) {

		WebDriver d = ChooseBrowser.selectBro("firefox", "http://newtours.demoaut.com/");
		LoginwithPageFactory tc = PageFactory.initElements(d, LoginwithPageFactory.class);
		tc.reg();

	}

}
