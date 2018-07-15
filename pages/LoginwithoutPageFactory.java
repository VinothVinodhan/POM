package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginwithoutPageFactory {

	WebDriver driver;
	By reg = By.linkText("REGISTER");
	By fn = By.name("firstName");
	By ln = By.name("lastName");
	By ph = By.name("phone");
	By mail = By.id("userName");
	By add = By.name("address1");

	public void regClick() {
		driver.findElement(reg).click();
		driver.findElement(fn).sendKeys("Name");
		driver.findElement(ln).sendKeys("Name1");

	}

	public void datafield() {

		driver.findElement(ph).sendKeys("12345");
		driver.findElement(mail).sendKeys("demo@mail.com");
		driver.findElement(add).sendKeys("Address1");

	}
	
	// Constructor concept
	// Choose browser is dif driver and LoginwithoutPageFactory diff driver.
	// using constructor we are telling system that both are same
	public LoginwithoutPageFactory(WebDriver d)
	//d is random name that we give
	
	{
		
		this.driver=d;
		//d is the driver name that we gave if for LoginwithoutPageFactory class
	}

}
