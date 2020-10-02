package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	WebDriver driver;

	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchKeyword(String keyword) {
		WebElement searchField = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		searchField.sendKeys(keyword);
		searchField.sendKeys(Keys.ENTER);
	}

	public boolean isSearchResultDisplayed() {
		WebElement results = driver.findElement(By.id("result-stats"));
		return results.getText().contains("results");
	}



	
}
