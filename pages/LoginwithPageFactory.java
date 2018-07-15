package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginwithPageFactory {

	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	@CacheLookup
	WebElement reg;

	@FindBy(how = How.NAME, using = "firstName")
	@CacheLookup
	WebElement fn;

	@FindBy(how = How.NAME, using = "lastName")
	@CacheLookup
	WebElement ln;

	@FindBy(how = How.NAME, using = "phone")
	@CacheLookup
	WebElement ph;

	@FindBy(how = How.ID, using = "userName")
	@CacheLookup
	WebElement mail;

	@FindBy(how = How.NAME, using = "address1")
	@CacheLookup
	WebElement add;

//if more number of elements, 
	//List <WebElement> "user"
	
	public void reg() {
		reg.click();
		fn.sendKeys("aaa");
		ln.sendKeys("bbb");
		ph.sendKeys("11111");
		mail.sendKeys("mail@mail.com");
		add.sendKeys("Address1");

		
	}
}