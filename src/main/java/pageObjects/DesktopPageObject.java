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
	
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a")
	private WebElement mac;
	
	@FindBy(xpath = "//a[text() = 'Show All Desktops']")
	private WebElement showAllDesktops;
	
	public boolean clickOnPC() {
		pc.click();
		if(driver.getTitle().equals("PC"))
			return true;
		else
			return false;
	}
	public boolean clickOnMac() {
		mac.click();
		if(driver.getTitle().equals("Mac"))
			return true;
		else
			return false;
	}
	public boolean clickOnShowAllDesktops() {
		showAllDesktops.click();
		if(driver.getTitle().equals("Desktops"))
			return true;
		else
			return false;
	}

}
