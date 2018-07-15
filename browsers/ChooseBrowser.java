package browsers;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChooseBrowser {
	// WebDriver static one, which will not change until my execution. So making
	// it as a Static
	// now webdriver is a static
	static WebDriver driver;

	// driver's DATA type is Webdriver and its a Static ( so static WebDriver instead of void)
	public static WebDriver selectBro(String bname, String URL) {

		if (bname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		else if (bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		driver.get(URL);
		// always give implicitly wait
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		// we are passing output as Driver, so Return is must
		// Im returning driver

		return driver;
	}

}
