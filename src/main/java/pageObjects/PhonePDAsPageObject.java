package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Basee;

public class PhonePDAsPageObject extends Basee{
	public PhonePDAsPageObject() {
		
	}
	
	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	private WebElement phonesPDA;
	@FindBy(xpath = "//h2[text()='Phones & PDAs']")
	private WebElement phonesPDASearch ;
	@FindBy(xpath = "//button[@id='list-view']")
	private WebElement listView ;
	@FindBy(xpath = "//button[@id='grid-view']")
	private WebElement gridView ;
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement productCompare ;
	@FindBy(xpath = "//label[text()='Sort By:']")
	private WebElement sortBy ;
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement defaultValue ;
	@FindBy(xpath = "//label[text()='Show:']")
	private WebElement show ;
	@FindBy(xpath = "/select[@id='input-limit']")
	private WebElement showList ;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")
	private WebElement htcTouchImage;
	@FindBy(xpath = "//a[text()='HTC Touch HD']")
	private WebElement htcTouch;
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')and(@xpath='1')]")
	private WebElement addToCart;
	@FindBy(xpath = "//i[@class='fa fa-heart' and @xpath='1']")
	private WebElement addToWishlist ;
	@FindBy(xpath = "//i[@class='fa fa-exchange' and @xpath='1']")
	private WebElement compareThisProduct ;
	@FindBy(xpath = "//img[@class='img-responsive' and @xpath='1']")
	private WebElement iphoneImage;
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iphone ;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div/div[1]/a/img")
	private WebElement palmTreeImage;
	@FindBy(xpath = "//a[text()='Palm Treo Pro']")
	private WebElement palmTreoPro;



}
