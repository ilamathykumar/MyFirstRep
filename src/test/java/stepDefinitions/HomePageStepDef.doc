package stepDefinitions;

import core.Basee;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import utilities.UtilityClass;

public class HomePageStepDef extends Basee {

	HomePageObject homePageObject = new HomePageObject();
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePageObject.clickOnCurrency();
		logger.info("user clicked on curency");
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePageObject.chooseEuro();
		logger.info("user chose euro from dropdown");

	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homePageObject.getSymbol();
		logger.info("currency value changed to euro");
		 UtilityClass.takeScreenShot();

	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePageObject.clickOnShoppingCart();
		logger.info("user clicked on shopping cart");

	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		homePageObject.getCartEmptyMessage();
		logger.info("shopping cart is empty");
		 UtilityClass.takeScreenShot();
	}
}
