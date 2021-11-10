package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Basee;

public class RetailPagePageObject extends Basee{

	public RetailPagePageObject() {
		PageFactory.initElements(driver, this);
	}

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
	
	@FindBy(xpath="//a[text()='Register for an affiliate account']")
	private WebElement registerForAffiliate;
	
	@FindBy(xpath="//input[@id='input-company']")
	private WebElement companyName;
	
	@FindBy(xpath="//input[@id='input-website']")
	private WebElement webSiteName;
	
	@FindBy(xpath= "//input[@id='input-tax']")
	private WebElement taxIDinfo;
	
	@FindBy(xpath="//input[@id='input-cheque']")
	private WebElement chequePayee;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement aboutUS;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement continueButton ;
	
	@FindBy(xpath="//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMsg;
	@FindBy(xpath="//a[text()='Edit your affiliate information']")
	private WebElement editAffiliate;
	@FindBy(xpath="//input[@value='bank']")
	private WebElement bankTransferRadioButton ;
	
	@FindBy(id="input-bank-name")
	private WebElement bankName;
	
	@FindBy(id="input-bank-branch-number")
	private WebElement branchNumber ;
	
	@FindBy(id="input-bank-swift-code")
	private WebElement swiftCode;
	
	@FindBy(id="input-bank-account-name")
	private WebElement accountName ;
	
	@FindBy(id="input-bank-account-number")
	private WebElement accountNumber ;

	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement editAccountInfo;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement phone;


	
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
	
	public void clickOnRegisterForAffiliate() {
		registerForAffiliate.click();
	}
	public void enterCompanyName(String compName) {
		companyName.sendKeys(compName);
	}
	public void enterWebsiteName(String websiteName) {
		webSiteName.sendKeys(websiteName);
	}
	public void enterTaxIdInfo(String taxNo) {
		taxIDinfo.sendKeys(taxNo);
	}
    public void enterChequePayee(String chequepayee) {
    	chequePayee.sendKeys(chequepayee);
    }
    public void clickOnAboutus() {
    	aboutUS.click();
    }
    public void clickOnContinue() {
    	continueButton.click();
    }
    public String getSuccessMessage() {
    	return successMsg.getText();	
    }
    public void clickOnEditAffiliate() {
    	editAffiliate.click();
    }
    public void clickOnBankRadioButton() {
    	bankTransferRadioButton.click();
    }
    public void enterBankName(String bankInfo) {
    	bankName.sendKeys(bankInfo);
    }
    public void enterBranchNumber(String branchInfo) {
    branchNumber.sendKeys(branchInfo);
    }
    public void enterSwiftCode(String swiftCodeInfo) {
    	swiftCode.sendKeys(swiftCodeInfo);
    }
    public void enterAccountName(String AccountInfo) {
    	accountName.sendKeys(AccountInfo);
    }
    public void enterAccountNumber(String AccountNo) {
    	accountNumber.sendKeys(AccountNo);
    }
    
    public void clickOnEditAccount() {
    	editAccountInfo.click();
    }
	public void enterFirstName(String fName) {
		firstName.sendKeys(fName);

	}

	public void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}

	public void enterEmail(String e_mail) {
		email.sendKeys(e_mail);
	}

	public void enterPhone(String phoneValue) {
		phone.sendKeys(phoneValue);
	}

}
