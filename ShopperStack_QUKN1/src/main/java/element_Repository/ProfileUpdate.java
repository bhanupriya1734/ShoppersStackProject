package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileUpdate extends BasePage{

	public ProfileUpdate(WebDriver driver) {
		super(driver);
		
	}
		
	@FindBy(xpath="//button[contains(text(),'Edit Profile')]")
	private WebElement editProfileButton;
	
	@FindBy(id="First Name")
	private WebElement editProfileFirstNameButton;
	
	@FindBy(id="Last Name")
	private WebElement editProfileLastNameButton;
	
	@FindBy(xpath="//button[contains(@aria-label,'Choose date')]")
	private WebElement calendarIcon;

	@FindBy(xpath="//button[text()='Jan']")
	private WebElement selectMonthButton;
	
	public WebElement getSelectMonthButton() {
		return selectMonthButton;
	}

	@FindBy(xpath="//button[text()='1']")
	private WebElement selectDateButton;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumberTextField;
	
	@FindBy(xpath="//option[text()='Country']")
	private WebElement countryDropDown;
	
	@FindBy(xpath="//option[text()='India']")
	private WebElement indiaDropDown;
	
	@FindBy(id="State")
	private WebElement stateDropDown;
	
	@FindBy(id="Tamil Nadu")
	private WebElement tamilnaduDropDown;
	
	@FindBy(id="City")
	private WebElement cityDropDown;
	
	@FindBy(id="Coimbatore")
	private WebElement coimbatoreDropDown;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement submitButton;
	
	@FindBy(xpath="//button[text()='1969']")
	private WebElement selectYearButton;
	
	public WebElement getSelectYearButton() {
		return selectYearButton;
	}

	public WebElement getEditProfileButton() {
		return editProfileButton;
	}

	public WebElement getEditProfileFirstNameButton() {
		return editProfileFirstNameButton;
	}

	public WebElement getEditProfileLastNameButton() {
		return editProfileLastNameButton;
	}

	public WebElement getCalendarIcon() {
		return calendarIcon;
	}
	
	public WebElement getSelectDateButton() {
		return selectDateButton;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getIndiaDropDown() {
		return indiaDropDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getTamilnaduDropDown() {
		return tamilnaduDropDown;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}
	
	public WebElement getCoimbatoreDropDown() {
		return coimbatoreDropDown;
	}
	
	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	public void performEditProfile() throws InterruptedException {
		
		getAccountButton().click();
		Thread.sleep(2000);
		getMyProfileButton().click();
		Thread.sleep(2000);
		getEditProfileButton().click();
		Thread.sleep(2000);
		getEditProfileFirstNameButton().sendKeys("Bhanupriya");
		Thread.sleep(2000);
		getEditProfileLastNameButton().sendKeys("M");
		Thread.sleep(2000);
		getCalendarIcon().click();
		Thread.sleep(2000);
		getSelectDateButton().click();
		Thread.sleep(2000);
		getSelectMonthButton().click();
		Thread.sleep(2000);
		getSelectYearButton().click();
		Thread.sleep(2000);
		getPhoneNumberTextField().sendKeys("9789495596");
		Thread.sleep(2000);
		getCountryDropDown().click();
		Thread.sleep(2000);
		getIndiaDropDown().click();
		Thread.sleep(2000);
		getStateDropDown().click();
		Thread.sleep(2000);
		getTamilnaduDropDown().click();
		Thread.sleep(2000);
		getCityDropDown().click();
		Thread.sleep(2000);
		getCoimbatoreDropDown().click();
		Thread.sleep(2000);
		getSubmitButton().click();
		
	}

	
}
