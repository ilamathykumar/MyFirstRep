package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Basee;

public class LoginPageObject extends Basee {
	//in this class we will store UI elements of Login Page
	//We will implement PageFactory.initElement method to initialize the page elements
	//We will use @FindBy annotations to store UI WebElements
	//We will store UI elements at private WebElements and access them
	//through public methods and we will write the function inside the public methods
	
	public LoginPageObject() {
		PageFactory.initElements(driver, this);

	}
	
	//PageFactory class provides an annotation @FindBy to find UI elements
	//@FindBy == driver.findElement()
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement login;
	
	@FindBy(id = "input-email")
	private WebElement email;
	
	@FindBy(id = "input-password")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value = 'Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountText;
	
	public void clickOnMyAccount()
	{
		myAccount.click();
	}
	public void clickOnLogin()
	{
		login.click();
	}
	public void enterEmailandPassword(String emailValue, String passwordValue) {
		email.sendKeys(emailValue);
		password.sendKeys(passwordValue);
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public boolean myAccountTextisPresent() {
		if(myAccountText.isDisplayed())
			return true;
		else
			return false;
	}
}
 