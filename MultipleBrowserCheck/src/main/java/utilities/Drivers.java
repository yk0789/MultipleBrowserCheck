package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
//		case "safari":
//			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
//			break;
		}
		return driver;
	}
	
}
