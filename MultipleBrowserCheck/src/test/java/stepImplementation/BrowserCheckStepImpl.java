package stepImplementation;

import org.openqa.selenium.WebDriver;

import pages.GoogleSearchPage;
import utilities.Drivers;

public class BrowserCheckStepImpl {
	
	Drivers drivers = new Drivers();
	WebDriver driver;
	GoogleSearchPage gsPage;
	
	public void openGoogle(String browser) {
		this.driver = drivers.getDriver(browser);
		driver.get("http://www.google.com");
		gsPage = new GoogleSearchPage(driver);
	}

	public void searchKeyword(String keyword) {
		gsPage.searchKeyword(keyword);
	}

	public boolean isSearchResultDisplayed() {
		return gsPage.isSearchResultDisplayed();
	}

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
