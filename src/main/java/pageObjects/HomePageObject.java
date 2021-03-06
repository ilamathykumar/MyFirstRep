package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Basee;

public class HomePageObject extends Basee{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;
	
	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euroButton;
	
	@FindBy(xpath="//strong[text()='€']")
	private WebElement symbolCurrency;
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//span[text()='Wish List (0)']")
	private WebElement wishList;
	
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCart;
	
	@FindBy(xpath="//div[@id='content']//p[text()='Your shopping cart is empty!']")
	private WebElement cartEmpty;
	
	@FindBy(xpath = "//span[text()='Checkout']")
	private WebElement checkOut;
	
	@FindBy(xpath = "//input[@name = 'search']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//i[@class='fa fa-search']")
	private WebElement searchIcon;
	
	@FindBy(xpath = "//span[@id = 'cart-total']")
	private WebElement shoppingCartItems;
	
	@FindBy(xpath = "////div[@class='swiper-slide text-center swiper-slide-prev swiper-slide-duplicate-next']")
	private WebElement image1 ;
	
	@FindBy(xpath = "//div[@class='swiper-slide text-center swiper-slide-active']")
	private WebElement image2 ;

	@FindBy(xpath = "//img[@title = 'MacBook']")
	private WebElement macBook;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]/span")
	private WebElement addToCartMac;		
	
	@FindBy(xpath="//a[@id='wishlist-total']//i[@class='fa fa-heart']")
	private WebElement addToWishList;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[3]/i")
	private WebElement productCompare;
	
	@FindBy(xpath = "//img[@title = 'iPhone']")
	private WebElement iPhone;
	
	@FindBy(xpath = "//img[@title = 'Apple Cinema 30\"']")
	private WebElement appleCinema;
	
	@FindBy(xpath = "//img[@title = 'Canon EOS 5D']")
	private WebElement canon;
	
	@FindBy(xpath="//h5[text()='Information']")
    private WebElement information ;
	
	@FindBy(xpath="//a[text()='About Us']")
	private WebElement aboutUs ;
	
	@FindBy(xpath="//a[text()='Delivery Information']")
	private WebElement deliveryInformation ;
	
	@FindBy(xpath="//a[text()='Privacy Policy']")
	private WebElement privacyPolicy ;
	
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	private WebElement termsAndConditions ;
	
	@FindBy(xpath="//h5[text()='Customer Service']")
	private WebElement customerService;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUs;
	
	@FindBy(xpath="//a[text()='Returns']")
	private WebElement returns ;
	
	@FindBy(xpath="//a[text()='Site Map']")
	private WebElement siteMap ;
	
	@FindBy(xpath="//h5[text()='Extras']")
	private WebElement extras;
	
	@FindBy(xpath="//a[text()='Brands']")
	private WebElement brands ;
	
	@FindBy(xpath="//a[text()='Gift Certificates']")
	private WebElement giftCertificates;
	
	@FindBy(xpath="//a[text()='Affiliate']")
	private WebElement affiliate ;
	
	@FindBy(xpath="//a[text()='Specials']")
	private WebElement specials ;
	
	@FindBy(xpath="//h5[text()='My Account']")
	private WebElement MyAccount;
	
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement myAccountLink ;
	
	@FindBy(xpath="//a[text()='Order History']")
	private WebElement orderHistory ;
	
	@FindBy(xpath="//a[text()='Wish List']")
	private WebElement WishList;
	
	@FindBy(xpath="//a[text()='Newsletter']")
	private WebElement newsLetter;
	
	@FindBy(xpath="//a[text()='OpenCart']")
	private WebElement openCart;
	
	public void clickOnCurrency() {
		currency.click();
	}
	public void chooseEuro() {
		euroButton.click();
	}
	public String getSymbol() {
		return symbolCurrency.getText();
	}
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}
	public String getCartEmptyMessage() {
		return cartEmpty.getText();
	}
	
}
