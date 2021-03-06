package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Basee;

public class LaptopsPageObject extends Basee{

  public LaptopsPageObject() {
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath = "//a[text()='Laptops & Notebooks']")
  private WebElement laptops;
  
  @FindBy(xpath = "//a[text()='Macs (0)']")
  private WebElement macs;
  
  @FindBy(xpath = "////a[text()='Windows (0)']")
  private WebElement windows;
  
  @FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
  private WebElement showAllLaptops;
  
  @FindBy(xpath="//a[text()='Desktops (13)']")
  private WebElement desktops ;
  
  @FindBy(xpath="//a[text()='Laptops & Notebooks (5)']")
  private WebElement laptopsSideBar;
  
  @FindBy(xpath="//a[contains(text(),'- Macs (0)')]")
  private WebElement macsSideBar;
  
  @FindBy(xpath="//a[contains(text(),'- Windows (0)')]")
  private WebElement windowsSideBar ;
  
  @FindBy(xpath="//a[text()='Components (2)']")
  private WebElement componentsSideBar ;
  
  @FindBy(xpath="//a[text()='Tablets (1)']")
  private WebElement tabletsSideBar;
  
  @FindBy(xpath="//a[text()='Software (0)']")
  private WebElement softwareSideBar;
  
  @FindBy(xpath="//a[text()='Phones & PDAs (3)']")
  private WebElement phonesSideBar ;
  
  @FindBy(xpath="//a[text()='Cameras (2)']")
  private WebElement cameraSideBar;
  
  @FindBy(xpath="//a[text()='MP3 Players (4)']")
  private WebElement mp3Players;
  
  @FindBy(xpath="//h2[text()='Laptops & Notebooks']")
  private WebElement laptopsTitle;
  
  @FindBy(xpath="//img[@class='img-thumbnail']")
  private WebElement laptopImage;
  
  @FindBy(xpath="//h3[text()='Refine Search']")
  private WebElement searchResult;
  
  @FindBy(xpath="//i[@class='fa fa-th-list']")
  private WebElement listBlock;
  
  @FindBy(xpath="//button[@class='btn btn-default active']")
  private WebElement gridBlock;
  
  @FindBy(xpath="//a[@class='btn btn-link']")
  private WebElement productCompare;
  
  @FindBy(xpath = "//label[text()='Sort By:']")
   private WebElement sortBy;
  
  @FindBy(xpath = "//select[@id='input-sort']")
  private WebElement sortByList ;
  
  @FindBy(xpath = "//label[text()='Show:']")
  private WebElement show ;
  
  @FindBy(xpath = "/select[@id='input-limit']")
  private WebElement showList ;
  
  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[1]/div/div[1]/a/img")
  private WebElement hpImage;
  
  @FindBy(xpath="//a[text()='HP LP3065']")
  private WebElement HPLP3065;
  
  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[1]/span")
  private WebElement addCartHP;
  
  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[2]")
  private WebElement addWishlistHP;
  
  @FindBy(xpath="[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[3]")
  private WebElement compareProductHPLP;

  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]/div/div[1]/a/img")
  private WebElement macBookImage;
  
  @FindBy(xpath="//a[text()='MacBook']")
  private WebElement macBookLink;
  
  @FindBy(id="button-cart")
  private WebElement addCartMacBook;
  
  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[2]")
  private WebElement addWishListMacBook ;
  
  @FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]/i[1]")
  private WebElement compareProductMacBook;
  
  @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
  private WebElement cartSuccessMessageMac;
  
  @FindBy(xpath ="//span[@id='cart-total']")
  private WebElement cartAmount;
  
  @FindBy(xpath="//i[@class='fa fa-times']")
  private WebElement removeItem;

  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div/div[1]/a/img")
  private WebElement macBookAirImage ;
  
  @FindBy(xpath="//a[text()='MacBook Air']")
  private WebElement macBookAirLink;
  
  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[1]/span")
  private WebElement addCartmacBookAir;
  
  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[2]")
  private WebElement addWishListMacBookAir ;
  
  @FindBy(xpath="//body/div[@id='product-category']/div[2]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[3]")
   private WebElement compareProductMacBookAir;
  
  @FindBy(xpath="//body/div[@id='product-category']/div[1]")
  private WebElement successMessageMacAir;
  
  @FindBy(xpath="//a[text()='product comparison']")
  private WebElement productComparison;
  
  @FindBy(xpath="//div[@id='content']//h1[text()='Product Comparison']")
  private WebElement chartTitle;

  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[4]/div/div[1]/a/img")
  private WebElement macBookProImage ;
  
  @FindBy(xpath="//a[text()='MacBook Pro']")
  private WebElement macBookProLink;
  
  @FindBy(xpath="//li[text()='Ex Tax: $2,000.00']")
  private WebElement macPrice;
  
  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[2]/button[1]/span")
  private WebElement addCartMacBookPro;
  
  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[2]/button[2]/i")
  private WebElement addWishListMacBookPro;
  
  @FindBy(xpath="[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[2]/button[3]")
  private WebElement compareProductMacBookPro;

  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[5]/div/div[1]/a/img")
  private WebElement sonyVAIOImage ;
  
  @FindBy(xpath="//a[text()='Sony VAIO']")
  private WebElement sonyVAIOLink;
  
  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[1]/span")
  private WebElement addCartSonyVAIO;
  
  @FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]/i[1]")
  private WebElement addWishListSonyVAIO;
  
  @FindBy(xpath="[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[3]")
  private WebElement compareProductSonyVAIO;
  
  public void laptopLink() {
	  laptops.click();
  }
  public void showAllLink() {
	  showAllLaptops.click();
  }
  public void macBookLink() {
	  macBookLink.click();
  }
  public void macAddToCart() {
	  addCartMacBook.click();
  }
  public String successMessageMac() {
	  return cartSuccessMessageMac.getText();
  }
  public String cartTotalShown() {
	  return cartAmount.getAttribute("innerText");
  }
    public void cartTotal() {
	  cartAmount.click();
  }
  public void optionClick() {
	  cartAmount.click();
  }
  public void removeItemFromCart() {
	  removeItem.click();
  }
  public String cartTotalAfterRemoval(Integer int1) {
	  return cartAmount.getText();
  }
  public void clickOnComparMac() {
	  compareProductMacBook.click();
  }
  public void clickOnCompareMacbookAir() {
	  compareProductMacBookAir.click();
  }
   public String getSuccessMessageAir() {
	  return successMessageMacAir.getText();
  }
  public void comparisionOfProducts() {
	  productComparison.click();
  }
  public String productComparisonChart() {
      return chartTitle.getText();
  }
  public void clickOnHeart() {
	  addWishListSonyVAIO.click();
  }
  public void clickOnMacbookPro() {
	  macBookProLink.click();
  }
  public String checkPriceTag(Double double1) {
	  return macPrice.getText();
  }
  
}