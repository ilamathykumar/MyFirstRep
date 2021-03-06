package stepDefinitions;

import org.junit.Assert;

import core.Basee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopsPageObject;
import utilities.UtilityClass;

public class LaptopStepDef extends Basee {
	LaptopsPageObject laptopPageObject = new LaptopsPageObject();
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopPageObject.laptopLink();
		logger.info("user clicked  laptop tab");
	}
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopPageObject.showAllLink();
		logger.info("user clicked show all laptop tab");
	}
	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopPageObject.macBookLink();
		logger.info("user clicked macbook");
	}
	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
        String expectedMessage ="Success: You have added MacBook to your shopping cart!";
	    String actualMessage =laptopPageObject.successMessageMac().replaceAll("[^a-zA-z:! ]","");
        Assert.assertEquals(expectedMessage,actualMessage );
	    logger.info("user see the success message");
		 UtilityClass.takeScreenShot();
	}
	@Then("User should see ‘{int} item\\(s){double}’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
		String expectedMessage = " 1 item(s) - $602.00";
		String actualMessage =	laptopPageObject.cartTotalShown();
        Assert.assertEquals(expectedMessage,actualMessage );
		logger.info("user see 1 item(s)-602.00 in the cart");
		 UtilityClass.takeScreenShot();
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopPageObject.cartTotal();
	    logger.info("user clicked cart option");
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopPageObject.removeItemFromCart();
		logger.info("user clicked red button to remove the item");
	}
	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		laptopPageObject.cartTotalAfterRemoval(int1);
		logger.info("item is removed and shows 0 item");
	}
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException{
		laptopPageObject.clickOnComparMac();
		Thread.sleep(5000);
		logger.info("user clicked compareproduct in Macbook");
	}
	
	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() throws InterruptedException{
		laptopPageObject.clickOnCompareMacbookAir();
		Thread.sleep(5000);
		logger.info("user clicked compareproduct in Macbook Air");
	}
	
	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_Air_to_your_product_comparison() {
        String expectedMessage ="Success: You have added MacBook Air to your product comparison!";
	    String actualMessage =laptopPageObject.getSuccessMessageAir().replaceAll("[^a-zA-z:! ]","");
        Assert.assertEquals(expectedMessage,actualMessage );
	    logger.info("user see the success message");
		 UtilityClass.takeScreenShot();
	}
	
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopPageObject.comparisionOfProducts();
	    logger.info("user clicked comparison link");
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopPageObject.productComparisonChart();
		 UtilityClass.takeScreenShot();
		 logger.info("user see the comparision chart");

	}
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopPageObject.clickOnHeart();
		logger.info("user clicked add to wishlist");
	}
	
	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
         String expectedMessage = "You must login or create an account to save Sony VAIO to your wish list!";
 	     String actualMessage =laptopPageObject.successMessageMac().replaceAll("[^a-zA-z:! ]","");
        Assert.assertEquals(expectedMessage,actualMessage );
	    logger.info("user see the success message");
		 UtilityClass.takeScreenShot();
	}
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptopPageObject.clickOnMacbookPro();
		logger.info("user clicked macbook pro");
	}
	
	@Then("User should see  ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		laptopPageObject.checkPriceTag(double1);
	    logger.info("user see pricetag");
		 UtilityClass.takeScreenShot();
   	}

}
