package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Basee;

public class LaptopsPageObject extends Basee{



  public LaptopsPageObject() {
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath = "//a[text()='Laptops & Notebooks']")
  private WebElement laptops;
  
  @FindBy(xpath = "//a[text()='Macs (0)']")
  private WebElement macs;
  @FindBy(xpath = "////a[text()='Windows (0)']']")
  private WebElement windows;
  @FindBy(xpath = "////a[text()='Show All Laptops & Notebooks']']")
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
  private WebElement taptopsTitle;;
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
  @FindBy(xpath = "//div[@class='image']//img[@class='img-responsive']")

  

  
  
}