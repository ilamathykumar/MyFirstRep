package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Basee;

public class ComponentsPageObject extends Basee{
	
	public ComponentsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Mice and Trackballs (0)']")
	private WebElement miceAndTrackballs;
	
	@FindBy(xpath = "//a[text()='Monitors (2)']")
	private WebElement monitors;
	
	@FindBy(xpath = "//a[text()='Printers (0)']")
	private WebElement printers;
	
	@FindBy(xpath = "//a[text()='Scanners (0)']")
	private WebElement scanners;
	
	@FindBy(xpath = "//a[text()='Web Cameras (0)']")
	private WebElement webCameras;
	
	@FindBy(xpath = "//a[text()='Show All Components']")
	private WebElement showAllComponents;
	
	@FindBy(xpath = "/a[contains(text(),'Continue')]")
	private WebElement continueMice;
	
	@FindBy(xpath="//a[text()='test 1 (0)']")
	private WebElement test1 ;
	@FindBy(xpath="//a[text()='test 2 (0)']")
	private WebElement test2 ;
	@FindBy(xpath="//button[@id='list-view']")
	private WebElement listView ;
	@FindBy(xpath="//button[@id='grid-view']")
	private WebElement gridView ;
	@FindBy(xpath="//a[@id='compare-total']")
	private WebElement productCompare ;


	

	@FindBy(xpath = "//div[@id='banner0']//img[@class='img-responsive']")
	private WebElement appleImage;
	@FindBy(xpath = "/a[contains(text(),'Apple Cinema 30\"')]")
	private WebElement appleCinema;
	@FindBy(xpath = "//span[contains(text(),'Add to Cart') and (@xpath='1')]")
	private WebElement addToCartappleCinema;

	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[2]/i")
	private WebElement wishListAppleCinema;

	@FindBy(xpath = "//button[@type='button']//i[@xpath='1']")
	private WebElement compareProductAppleCinemas;
	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/div/div[1]/a/img")
	private WebElement samsungImage;
	@FindBy(xpath = "/a[contains(text(),'Samsung SyncMaster 941BW')]")
	private WebElement samsungMonitor;
	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[2]/button[1]/span")
	private WebElement addToCartSamsungMonitor;
	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[2]/button[2]")
	private WebElement wishListSamsungMonitor;
	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[2]/button[3]/i")
	private WebElement compareProductSamsungMonitor;
	@FindBy(xpath = "//h2[text()='Printers']")
	private WebElement printersList;
	@FindBy(xpath = "/a[contains(text(),'Continue')]")
	private WebElement continuePrinters;
	@FindBy(xpath = "//h2[text()='Scanners']")
	private WebElement scannersList;
	@FindBy(xpath = "/a[contains(text(),'Continue')]")
	private WebElement continueScanners;
	
	@FindBy(xpath = "//h2[text()='Web Cameras']")
	private WebElement webCamerasList;
	@FindBy(xpath = "/a[contains(text(),'Continue')]")
	private WebElement continueWebCameras;
	@FindBy(xpath = "/h2[contains(text(),'Components')]")
	private WebElement componentsList;
	@FindBy(xpath = "/h3[contains(text(),'Refine Search')]")
	private WebElement refineSearchList;
	
	

	






}
