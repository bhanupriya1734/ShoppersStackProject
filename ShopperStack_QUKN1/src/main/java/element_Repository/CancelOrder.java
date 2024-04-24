package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelOrder extends BasePage{
	
	public CancelOrder(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//li[text()='My Orders']")
	private WebElement myOrdersButton;
	
	@FindBy(xpath="//button[text()='Cancel Order']")
	private WebElement cancelOrderButton;
	
	@FindBy(xpath="//button[text()='Yes']") 
	private WebElement termsAndConditionsYesbutton;
		
	public WebElement getMyOrdersButton() {
		return myOrdersButton;
	}
	
	public WebElement getCancelOrderButton() {
		return cancelOrderButton;
	}
	
	public WebElement getTermsAndConditionsYesbutton() {
		return termsAndConditionsYesbutton;
	}
	
	public void perfromCancelOrder() throws InterruptedException {
		
		getAccountButton().click();
		Thread.sleep(2000);
		getMyOrdersButton().click();
		Thread.sleep(2000);
		getCancelOrderButton().click();
		Thread.sleep(5000);
		
		
	}
		
}
	
	
	