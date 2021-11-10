package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Basee;

public class CamerasPageObject extends Basee {
	
	public CamerasPageObject() {
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath = "//a[text()='Canon (1)']")
	private WebElement canon;
	@FindBy(xpath = "//a[text()='Nikon (1)']")
	private WebElement nikon;
	@FindBy(xpath = "//a[text()='Show All Cameras']")
	private WebElement showAllCameras;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[1]/a/img")
	private WebElement cameraImage ;
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonLink;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[1]/a/img")
	private WebElement nikonImage;
	@FindBy(xpath = "//a[text()='Nikon D300']")
	private WebElement nikonLink;
	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearch;


}
