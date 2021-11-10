package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Basee;

public class MP3PlayersPageObject extends Basee{

	public MP3PlayersPageObject() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='test 11 (0)']")
	private WebElement test11 ;
	@FindBy(xpath = "//a[text()='test 12 (0)']")
	private WebElement test12;
	@FindBy(xpath = "//a[text()='test 15 (0)']")
	private WebElement test15;
	@FindBy(xpath = "//a[text()='test 16 (0)']")
	private WebElement test16;
	@FindBy(xpath = "//a[text()='test 17 (0)']")
	private WebElement test17;
	@FindBy(xpath = "//a[text()='test 18 (0)']")
	private WebElement test18;
	@FindBy(xpath = "//a[text()='test 19 (0)']")
	private WebElement test19 ;
	@FindBy(xpath = "//a[text()='test 20 (0)']")
	private WebElement test20;
	@FindBy(xpath = "//a[text()='test 21 (0)']")
	private WebElement test21;
	@FindBy(xpath = "//a[text()='test 22 (0)']")
	private WebElement test22 ;
	@FindBy(xpath = "//a[text()='test 23 (0)']")
	private WebElement test23;
	@FindBy(xpath = "//a[text()='test 24 (0)']")
	private WebElement test24;
	@FindBy(xpath = "//a[text()='test 4 (0)']")
	private WebElement test4;
	@FindBy(xpath = "//a[text()='test 5 (0)']")
	private WebElement test5;
	@FindBy(xpath = "//a[text()='test 6 (0)']")
	private WebElement test6;
	@FindBy(xpath = "//a[text()='test 7 (0)']")
	private WebElement test7;
	@FindBy(xpath = "//a[text()='test 8 (0)")
	private WebElement test8;
	@FindBy(xpath = "//a[text()='test 9 (0)")
	private WebElement test9;
	@FindBy(xpath = "//a[text()='Show All MP3 Players']")
	private WebElement showAll ;

	}


