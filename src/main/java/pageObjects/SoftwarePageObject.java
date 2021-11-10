package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Basee;

public class SoftwarePageObject extends Basee {
	
	public SoftwarePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Software']")
	private WebElement Software ;
	@FindBy(xpath = "//h2[text()='Software']")
	private WebElement softwareSearch ;
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement continueButton ;
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement homeButton ;


}
