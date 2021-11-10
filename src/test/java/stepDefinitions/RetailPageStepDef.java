package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Basee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPagePageObject;
import utilities.UtilityClass;

public class RetailPageStepDef extends Basee {

	RetailPagePageObject retailPageObject = new RetailPagePageObject();
	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
		retailPageObject.clickOnMyAccount();
		logger.info("user click on myAccount");
	}
	@When("User click on Login")
	public void user_click_on_login() {
		retailPageObject.clickOnLogin();
		logger.info("user clicks on login");
	}
	@When("User enter username {string} and password {string}")
	public void user_enter_username_user_name_and_password(String uName, String password) {
		retailPageObject.enterEmailandPassword(uName, password);
		logger.info("user Enter " + uName + "and password " +password);
		 UtilityClass.takeScreenShot();

	}
	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailPageObject.clickOnLoginButton();
		logger.info("user clicked on Login Button");

	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
              Assert.assertTrue(retailPageObject.myAccountTextisPresent());
      		logger.info("user is logged into myaccount dashboard");
   		 UtilityClass.takeScreenShot();

	}
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailPageObject.clickOnRegisterForAffiliate();
		logger.info("user clicked on reister affiliate");

	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		retailPageObject.enterCompanyName(info.get(0).get("compName"));
		retailPageObject.enterWebsiteName(info.get(0).get("websiteName"));
		retailPageObject.enterTaxIdInfo(info.get(0).get("taxNo"));
		retailPageObject.enterChequePayee(info.get(0).get("chequepayee"));
		logger.info("user entered personal information " + info.toString());
		 UtilityClass.takeScreenShot();

	}
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPageObject.clickOnAboutus();
		logger.info("user checked on about us checkbox");

	}
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailPageObject.clickOnContinue();
		logger.info("user clicked on continue button");

	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retailPageObject.getSuccessMessage();
		logger.info("user see the success message");
		 UtilityClass.takeScreenShot();

	}
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retailPageObject.clickOnEditAffiliate();
	    logger.info("user clicked on edit affiliate");
	}
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPageObject.clickOnBankRadioButton();
		logger.info("user clicked on bank transfer radio button");
		
	}
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> info1= dataTable.asMaps(String.class, String.class);
		retailPageObject.enterBankName(info1.get(0).get("bankInfo"));
		retailPageObject.enterBranchNumber(info1.get(0).get("branchInfo"));
		retailPageObject.enterSwiftCode(info1.get(0).get("swiftCodeInfo"));
		retailPageObject.enterAccountName(info1.get(0).get("AccountInfo"));
		retailPageObject.enterAccountNumber(info1.get(0).get("AccountNo"));
		logger.info("user enter bank information " + info1.toString());
		 UtilityClass.takeScreenShot();

	}
	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		retailPageObject.clickOnEditAccount();
	   logger.info("user clicked on edit account info");
	}
	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> info3 = dataTable.asMaps(String.class, String.class);
		retailPageObject.enterFirstName(info3.get(0).get("fName"));
		retailPageObject.enterLastName(info3.get(0).get("lName"));
		retailPageObject.enterEmail(info3.get(0).get("e_mail"));
		retailPageObject.enterPhone(info3.get(0).get("phoneValue"));
		logger.info("user filled the info");
		 UtilityClass.takeScreenShot();

		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	}
	
	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
	    // Write code here that turns the phrase above into concrete actions
		retailPageObject.getSuccessMessage();
		 UtilityClass.takeScreenShot();

	}




}
