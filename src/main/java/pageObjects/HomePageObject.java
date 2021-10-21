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
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//span[text()='Wish List (0)']")
	private WebElement wishList;
	
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCart;
	
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
	
	@FindBy(xpath = "//img[@title = 'iPhone']")
	private WebElement iPhone;
	
	@FindBy(xpath = "//img[@title = 'Apple Cinema 30\"']")
	private WebElement appleCinema;
	
	@FindBy(xpath = "//img[@title = 'Canon EOS 5D']")
	private WebElement canon;
}
