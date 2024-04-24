package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditCardDebitCard extends UpdateOrModify{

	public CreditCardDebitCard(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="buynow_fl")
	private WebElement buyNowButton;
	
	@FindBy(xpath="//button[text()='Add Card']")
	private WebElement addCardButton;
	
	@FindBy(xpath="//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'][1]")
	public WebElement cardHolderName;
	
	@FindBy(xpath="//input[@maxlength='16']")
	public WebElement cardNumber;
	
	@FindBy(xpath="//input[@maxlength='4']")
	public WebElement cardPin;
	
	@FindBy(xpath="//input[@maxlength='2']")
	public WebElement cardExpiryMonth;
	
	@FindBy(xpath="//label[text()='Expiry Year']/..//input")
	public WebElement cardExpiryYear;
	
	@FindBy(xpath="//input[@maxlength='3']")
	public WebElement cardCvvNumber;
	
	@FindBy(xpath="//input[@value='CREDIT']")
	public WebElement creditCardRadioButton;
	
	@FindBy(xpath="//button[text()='Add']")
	public WebElement cardAddButton;

	public WebElement getBuyNowButton() {
		return buyNowButton;
	}

	
	

	public WebElement getAddCardButton() {
		return addCardButton;
	}

	public WebElement getCardHolderName() {
		return cardHolderName;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardPin() {
		return cardPin;
	}

	public WebElement getCardExpiryMonth() {
		return cardExpiryMonth;
	}

	public WebElement getCardExpiryYear() {
		return cardExpiryYear;
	}

	public WebElement getCardCvvNumber() {
		return cardCvvNumber;
	}

	public WebElement getCreditCardRadioButton() {
		return creditCardRadioButton;
	}

	public WebElement getCardAddButton() {
		return cardAddButton;
	}
	public void performAddCard() throws InterruptedException {
		
		getCartIcon().click();
		Thread.sleep(2000);
		getBuyNowButton().click();
		Thread.sleep(2000);
		getAddressRadioButton().click();
		Thread.sleep(2000);
		getAddressProceedButton().click();
		Thread.sleep(2000);
		getAddCardButton().click();
		Thread.sleep(2000);
		getCardHolderName().sendKeys("Bhanu");
		Thread.sleep(2000);
		getCardNumber().sendKeys("4644578161238468");
		Thread.sleep(2000);
		getCardPin().sendKeys("8543");
		Thread.sleep(2000);
		getCardExpiryMonth().sendKeys("4");
		Thread.sleep(2000);
		getCardExpiryYear().sendKeys("29");
		Thread.sleep(2000);
		getCardCvvNumber().sendKeys("628");
		Thread.sleep(2000);
		getCreditCardRadioButton().click();
		Thread.sleep(2000);
		getCardAddButton().click();	
		Thread.sleep(6000);
		
	}
	
}
