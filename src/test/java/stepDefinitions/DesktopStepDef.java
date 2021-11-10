package stepDefinitions;

import org.junit.Assert;

import core.Basee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopPageObject;
import utilities.UtilityClass;

public class DesktopStepDef extends Basee {
	
	DesktopPageObject desktopPageObject = new DesktopPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle ="TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info("Actual title is matching with the expected title");
		UtilityClass.takeScreenShot();

	}
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopPageObject.clickOnDesktop();
		logger.info("user clicked on Desktops tab");
	}
		
	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPageObject.clickOnShowAllDesktops();
		logger.info("user clicked on Show all desktops");
	}
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	    Assert.assertTrue(desktopPageObject.desktopsTitleIsPresent());
	    logger.info("user see all items present in desktop page");
		UtilityClass.takeScreenShot();
	}
	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopPageObject.HPLP3065AddToCart();
		logger.info("user clicked Add To Cart option on HP LP3065");
	}
	
	@When("User select quantity {int}")
	public void user_select_quantity(Integer quantity) {
		desktopPageObject.enterQuantity(quantity);
		logger.info("user enter "+quantity);
	}
	
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPageObject.addToCartButton();
		logger.info("user clicked add to cart button");
	}
	
	@Then("User should see a message ‘Success: you have added HP LP3065 to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp3065_to_your_shopping_cart() {
        String expectedMessage =  "Success: You have added HP LP3065 to your shopping cart!";
	    String actualMessage =desktopPageObject.successMessage().replaceAll("[^a-zA-z:!0-9 ]","");
        Assert.assertEquals(expectedMessage,actualMessage);
         logger.info("HP LP 3065 was successfully added");
 		 UtilityClass.takeScreenShot();
	}
	
	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktopPageObject.canonAddToCart();
		logger.info("user clicked Add To Cart option on Canon EOS 5D");
	}
	
	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		desktopPageObject.selectRedColor();
		logger.info("user selected red color");
	}
	
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	   String expectedMessage = "Success: You have added Canon EOS 5D to your shopping cart!";
       String actualMessage =desktopPageObject.canonSuccessMessage().replaceAll("[^a-zA-z:!0-9 ]","");
	   Assert.assertEquals(expectedMessage, actualMessage);
	   logger.info("Canon EOS was successfully added");
		 UtilityClass.takeScreenShot();
	}
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPageObject.clickOnCanon();
		logger.info("user clicked on Canon EOS");

	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPageObject.clickOnReview();
		logger.info("user clicked on review button");
		
	}
	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information() {
		desktopPageObject.fillInf0();
		logger.info("review info was filled");
		 UtilityClass.takeScreenShot();
	}
	
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopPageObject.clickContinue();
		logger.info("user clicked on continue button");
	}
	
	@Then("User should see a message with ‘Thank you for your review. It has been submitted'.")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted() {
        String expectedMessage = "Thank you for your review. It has been submitted to the webmaster for approval.";
        Assert.assertEquals(expectedMessage, desktopPageObject.reviewMessage());
        logger.info("Review was successfully updated");
		 UtilityClass.takeScreenShot();
	}
}
