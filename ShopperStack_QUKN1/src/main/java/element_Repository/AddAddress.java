package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class AddAddress extends BasePage{

	public AddAddress(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//div[text()='My Addresses']")
	private WebElement myaddressesButton;
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressesButton;
	
	@FindBy(id="Home")
	private WebElement homeRadioButton;
	
	@FindBy(id="Name")
	private WebElement addAddressesNameTextField;
	
	@FindBy(xpath="//input[@maxlength='200']")
	private WebElement addAddressessHouseOfficeInfo;
	
	@FindBy(id="Street Info")
	private WebElement addAddressesStreetInfo;
	
	@FindBy(id="Landmark")
	private WebElement addAddressesLandmark;
	
	@FindBy(id="Country")
	private WebElement addAddressesCountry;
	
	@FindBy(id="India")
	private WebElement addAddressesIndia;
	
	@FindBy(id="State")
	private WebElement addAddressesState;
	
	@FindBy(id="Karnataka")
	private WebElement addAddressesKarnataka;
	
	@FindBy(id="City")
	private WebElement addAddressesCity;
	
	@FindBy(id="Bengaluru")
	private WebElement addAddressesBengaluru;
	
	@FindBy(id="Pincode")
	private WebElement addAddressesPincode;
	
	@FindBy(id="Phone Number")
	private WebElement addAddressesPhoneNumber;
	
	@FindBy(id="addAddress")
	private WebElement addAddressSubmitButton;
	
	public WebElement getAddAddressSubmitButton() {
		return addAddressSubmitButton;
	}


	public WebElement getMyaddressesButton() {
		return myaddressesButton;
	}


	public WebElement getAddAddressesButton() {
		return addAddressesButton;
	}


	public WebElement getHomeRadioButton() {
		return homeRadioButton;
	}


	public WebElement getAddAddressesNameTextField() {
		return addAddressesNameTextField;
	}


	public WebElement getAddAddressessHouseOfficeInfo() {
		return addAddressessHouseOfficeInfo;
	}


	public WebElement getAddAddressesStreetInfo() {
		return addAddressesStreetInfo;
	}


	public WebElement getAddAddressesLandmark() {
		return addAddressesLandmark;
	}


	public WebElement getAddAddressesCountry() {
		return addAddressesCountry;
	}


	public WebElement getAddAddressesIndia() {
		return addAddressesIndia;
	}


	public WebElement getAddAddressesState() {
		return addAddressesState;
	}


	public WebElement getAddAddressesKarnataka() {
		return addAddressesKarnataka;
	}


	public WebElement getAddAddressesCity() {
		return addAddressesCity;
	}


	public WebElement getAddAddressesBengaluru() {
		return addAddressesBengaluru;
	}


	public WebElement getAddAddressesPincode() {
		return addAddressesPincode;
	}


	public WebElement getAddAddressesPhoneNumber() {
		return addAddressesPhoneNumber;
	}


	public void perfromAddAddress() throws InterruptedException {
		
		
		getAccountButton().click();
		Thread.sleep(2000);
		getMyProfileButton().click();
		Thread.sleep(2000);
		getMyaddressesButton().click();
		Thread.sleep(2000);
		getAddAddressesButton().click();
		Thread.sleep(2000);
		getHomeRadioButton().click();
		Thread.sleep(2000);
		getAddAddressesNameTextField().sendKeys("Bhanupriya");
		Thread.sleep(2000);
		getAddAddressessHouseOfficeInfo().sendKeys("ABC Apartment");
		Thread.sleep(2000);
		getAddAddressesStreetInfo().sendKeys("10");
		Thread.sleep(2000);
		getAddAddressesLandmark().sendKeys("Near Post office");
		Thread.sleep(2000);
		getAddAddressesCountry().click();
		Thread.sleep(2000);
		getAddAddressesIndia().click();
		Thread.sleep(2000);
		getAddAddressesState().click();
		Thread.sleep(2000);
		getAddAddressesKarnataka().click();
		Thread.sleep(2000);
		getAddAddressesCity().click();
		Thread.sleep(2000);
		getAddAddressesBengaluru().click();
		Thread.sleep(2000);
		getAddAddressesPincode().sendKeys("560010");
		Thread.sleep(2000);
		getAddAddressesPhoneNumber().sendKeys("9897979895");
		Thread.sleep(2000);
	
				
	}

	
}
