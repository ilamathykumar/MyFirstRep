package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Basee;

public class RegisterPageObject extends Basee {

	public RegisterPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath="'//a[text()='Register']'")
	private WebElement register;
	
	@FindBy(xpath = "/input[@id='input-firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "/input[@id='input-lastname']")
	private WebElement lastName;

	@FindBy(xpath = "/input[@id='input-email']")
	private WebElement email;

	@FindBy(xpath = "/input[@id='input-telephone']")
	private WebElement phone;
	
	@FindBy(xpath = "/input[@id='input-password']")
	private WebElement password;
	
	@FindBy(xpath = "/input[@id='input-confirm']")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@name='newsletter' and @value = 1]")
	private WebElement yesSubscribeButton;
	
	@FindBy(xpath = "//input[@name='newsletter' and @value = 0]")
	private WebElement noSubscribeButton;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement privacyPolicy;
	@FindBy(xpath = "//input[@value ='Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement successMessage;

	public void clickOnRegister() {
		register.click();
	}
	public void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	public void enterLastName(String lName) {
		firstName.sendKeys(lName);
	}
	public void enterEmail(String e_mail) {
		email.sendKeys(e_mail);
	}

	public void enterPhone(String phoneValue) {
		phone.sendKeys(phoneValue);
	}

	public void enterPassword(String passwordValue) {
		password.sendKeys(passwordValue);
	}

	public void enterConfirmPassword(String confirmPassValue) {
		confirmPassword.sendKeys(confirmPassValue);
	}

	public void subscription(String value) {
		if (value.equalsIgnoreCase("yes") && !yesSubscribeButton.isSelected())
			yesSubscribeButton.click();
		else if (value.equalsIgnoreCase("no") && !noSubscribeButton.isSelected())
			noSubscribeButton.click();
	}

	public void clickOnPrivacyPolicy() {
		if (privacyPolicy.isDisplayed()) 
		privacyPolicy.click();
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

	public String getSuccessMessage() {
		return successMessage.getText();
	}






}
