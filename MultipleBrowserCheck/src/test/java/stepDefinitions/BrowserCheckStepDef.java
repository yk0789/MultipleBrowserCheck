package stepDefinitions;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import stepImplementation.BrowserCheckStepImpl;

public class BrowserCheckStepDef {

	BrowserCheckStepImpl stepImpl = new BrowserCheckStepImpl();
	
	@Given("^open google search using (.+)$")
	public void open_google_search_using(String browser)  {
		stepImpl.openGoogle(browser);
	}

	@When("^search for (.+)$")
	public void search_for(String keyword){
		stepImpl.searchKeyword(keyword);
	}

	@Then("^verify that search results are displayed$")
	public void verify_that_search_results_are_displayed()  {
		Assert.assertTrue(stepImpl.isSearchResultDisplayed());
	}

	@And("^close browser$")
    public void close_browser()  {
        stepImpl.closeBrowser();
    }
}
