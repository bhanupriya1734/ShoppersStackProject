package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	/**
	*
	*@author Afshan
	*
	**/
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginBtn")
	private WebElement welcomepageLoginButton;
		
	@FindBy(xpath = "//a[@id='men']")
	private WebElement menLink;
	
	@FindBy(xpath = "//button[@aria-label='Account settings']")
	private WebElement accountButton;
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logoutButton;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement loginpageEmailTextField;

	@FindBy(xpath="//input[@id='Password']")
	private WebElement loginpagePasswordTextField;
	
	@FindBy(xpath="//a[text()='Electronic']")
	private WebElement electronicTab;
	
	@FindBy(id="cartIcon")
	private WebElement cartIcon;
	
	@FindBy(id="buynow_fl")
	private WebElement buyNowButton;
	
	@FindBy(name="address")
	private WebElement addressRadioButton;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement addressProceedButton;
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfileButton;
	
	@FindBy(xpath="//a[text()='Men']")
	private WebElement menTab;
	
	@FindBy(xpath="//a[text()='Help Center']")
	private WebElement helpCenterButton;
	
	public WebElement getHelpCenterButton() {
		return helpCenterButton;
	}
	
	public WebElement getMenTab() {
		return menTab;
	}
	
	public WebElement getMyProfileButton() {
		return myProfileButton;
	}

	public WebElement getAddressProceedButton() {
		return addressProceedButton;
	}
	public WebElement getAddressRadioButton() {
		return addressRadioButton;
	}

	public WebElement getBuyNowButton() {
		return buyNowButton;
	}
	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getElectronicTab() {
		return electronicTab;
	}
	
	public WebElement getLoginpageEmailTextField() {
		return loginpageEmailTextField;
	}
	
	public WebElement getLoginpagePasswordTextField() {
		return loginpagePasswordTextField;
	}
	
	public WebElement getWelcomepageLoginButton() {
		return welcomepageLoginButton;
	}

	public WebElement getMenLink() {
		return menLink;
	}

	public WebElement getAccountButton() {
		return accountButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	public void performLogout() {
		
		getAccountButton().click();
		getLogoutButton().click();

	}
	
	
}
