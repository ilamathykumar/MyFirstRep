package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Basee;

public class TabletspageObject extends Basee {

	public TabletspageObject() {
		PageFactory.initElements(driver, this);
		
	}

@FindBy(xpath = "//a[text()='Tablets']")
private WebElement tabletsClick;
@FindBy(xpath = "//h2[text()='Tablets']")
private WebElement tabletsList ;
@FindBy(xpath = "//button[@id='list-view']//i[@class='fa fa-th-list']")
private WebElement listView ;
@FindBy(xpath = "//button[@id='grid-view']//i[@class='fa fa-th']")
private WebElement gridView ;
@FindBy(xpath = "/a[@id='compare-total']")
private WebElement productCompare ;
@FindBy(xpath = "//label[text()='Sort By:']")
private WebElement sortBy;
@FindBy(xpath = "//select[@id='input-sort']")
private WebElement sortByList ;
@FindBy(xpath = "//label[text()='Show:']")
private WebElement show ;
@FindBy(xpath = "/select[@id='input-limit']")
private WebElement showList ;
@FindBy(xpath = "//div[@class='image']//img[@class='img-responsive']")
private WebElement galaxyTabImage;
@FindBy(xpath = "//a[text()='Samsung Galaxy Tab 10.1']")
private WebElement galaxyTabLink;
@FindBy(xpath = "//span[text()='Add to Cart']")
private WebElement addToCart;
@FindBy(xpath = "//button[@type='button']//i[@class='fa fa-heart']")
private WebElement addToWishList;
@FindBy(xpath = "//button[@type='button']//i[@class='fa fa-exchange']")
private WebElement compareThisProduct;






}