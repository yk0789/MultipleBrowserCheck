package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Drivers {

	WebDriver driver;
	
	public WebDriver getDriver(String browser){
		switch(browser) {
		case "chrome" :
			System.setProperty("webdriver.chrome.driver", "resources/Drivers/chromedriver");
			this.driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
			this.driver = new FirefoxDriver();
			break;
		case "safari":
			this.driver = new SafariDriver();
			break;
		}
		return driver;
	}
	
}
