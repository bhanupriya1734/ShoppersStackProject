package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrder extends BasePage  {
	public PlaceOrder(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(id="buynow_fl")
	private WebElement buyNowButton;
	
	@FindBy(name="address")
	private WebElement addressRadioButton;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement addressProceedButton;
	
	@FindBy(xpath="//input[@value='COD']")
	private WebElement cashOnDeliveryButton;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement cashonDeliveryProceedButton;
	
	public WebElement getCashOnDeliveryButton() {
		return cashOnDeliveryButton;
	}

	public WebElement getCashonDeliveryProceedButton() {
		return cashonDeliveryProceedButton;
	}
	
	public void performPlaceOrder() throws InterruptedException {
		
		getCartIcon().click();
		Thread.sleep(2000);
		getBuyNowButton().click();
		Thread.sleep(2000);
		getAddressRadioButton().click();
		Thread.sleep(2000);
		getAddressProceedButton().click();
		Thread.sleep(2000);
		getCashOnDeliveryButton().click();
		Thread.sleep(2000);
		getCashonDeliveryProceedButton().click();
		Thread.sleep(2000);
		
	}
	
	
	
	
}

		


