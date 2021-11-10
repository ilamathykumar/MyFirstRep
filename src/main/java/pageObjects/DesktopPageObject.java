package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Basee;

public class DesktopPageObject extends Basee{
	
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[text()= 'Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath = "//a[text()= 'PC (0)']")
	private WebElement pc;
	
	@FindBy(xpath ="//a[text()='Mac (1)']")
	private WebElement mac;
	
	@FindBy(xpath = "//a[text() = 'Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(xpath = "//h2[text()='Desktops']")
	private WebElement desktopsTitle;
	
	@FindBy(xpath="//button[@id='list-view']")
	private WebElement listView ;
	
	@FindBy(xpath="//button[@id='grid-view']")
	private WebElement gridView ;
	
	@FindBy(xpath="//a[@id='compare-total']")
	private WebElement productCompare ;
	
	 @FindBy(xpath = "//label[text()='Sort By:']")
	 private WebElement sortBy;
	 
	 @FindBy(xpath = "//select[@id='input-sort']")
	 private WebElement sortByList ;
	 
	 @FindBy(xpath = "//label[text()='Show:']")
	 private WebElement show ;
	 
	 @FindBy(xpath = "/select[@id='input-limit']")
	 private WebElement showList ;


	                         
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[1]/a/img")
	private WebElement macImage;
	
	@FindBy(xpath="//a[text()='iMac']")
	private WebElement iMac;
	
	
	@FindBy(xpath = "//span[text()='Add to Cart']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//span[text()='Wish List (1)']")
	private WebElement wishList;
	
	@FindBy(xpath = "//i[@class='fa fa-exchange']")
	private WebElement CompareThisProduct;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[1]/span")
	private WebElement HPLP3065AddToCart;
	
	@FindBy(id="input-quantity")
	private WebElement enterQuantity;
	
	@FindBy(id="button-cart")
	private WebElement addCartButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement CanonE0SAddToCart;
	
	@FindBy(xpath="//select[@id='input-option226']//option[@value='15']")
	private WebElement selectColor;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageCanon;
	
	@FindBy(xpath="//h4//a[text()='Canon EOS 5D']")
	private WebElement canonlink;
	
	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement reviewButton;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continueButton;
	
	@FindBy(id="input-name")
	private WebElement yourName;
	
	@FindBy(id="input-review")
	private WebElement writeReview;
	
	@FindBy(xpath = "//input[@value='4']")
	private WebElement radioButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewSubmitMessage;
	
	
			
	
	public void clickOnDesktop() {
		desktops.click();		
	}
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	public boolean desktopsTitleIsPresent() {
		if(desktopsTitle.isDisplayed()) 
			return true;
		else
			return false;
			
		}
	public void HPLP3065AddToCart() {
		HPLP3065AddToCart.click();
	}
	
	public void enterQuantity(int quantity) {
		enterQuantity.clear();
		enterQuantity.sendKeys("1");
	}
	
	public void addToCartButton() {
		addCartButton.click();
	}
	
	public String successMessage() {
		return successMessage.getText();
	}
	
	public void canonAddToCart() {
		CanonE0SAddToCart.click();
	}
	
	public void selectRedColor() {
		selectColor.click();
	}
	
	public String canonSuccessMessage() {
		return successMessageCanon.getText();
	}
	
	public void clickOnCanon() {
		canonlink.click();
	}
	
	public void clickOnReview() {
		reviewButton.click();
	}
	
	public void fillInf0() {
		yourName.sendKeys("IlaKumar");
	    writeReview.sendKeys("It is good to use and easy to operate");
	    radioButton.click();
	}
	
	public void clickContinue() {
		continueButton.click();
	}
	
	public String reviewMessage() {
	     return reviewSubmitMessage.getText();
	}
	}


