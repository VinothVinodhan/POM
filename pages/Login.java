package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By Home = By.linkText("Home");
	By User = By.name("userName");
	By Pass = By.name("password");
	By LoginButton = By.name("login");

	public void regClick() {
		driver.findElement(Home).click();
		driver.findElement(User).sendKeys("123");
		driver.findElement(Pass).sendKeys("123");
		driver.findElement(LoginButton).click();

	}

	public Login(WebDriver d) {

		this.driver = d;
	}

}
