package stepDefinitions;

import org.junit.Assert;

import core.Basee;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TestPageObjectt;

public class TestStepDeff extends Basee {

	TestPageObjectt testPageObject = new TestPageObjectt();

	@When("user search for {string}")
	public void user_search_for(String string) {
		// Write code here that turns the phrase above into concrete actions
		testPageObject.enterValueForSearchBar(string);
		testPageObject.clickOnSearchButton();
	}

	@Then("iphone should be displayed")
	public void iphone_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(testPageObject.isIphoneDisplayed());
	}

}
