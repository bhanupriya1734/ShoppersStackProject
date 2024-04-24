package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddMoney extends BasePage{

	public AddMoney(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//button[text()='Credit Card']")
	private WebElement creditCardTab;
	
	@FindBy(xpath="//button[text()='Add Amount']")
	private WebElement addAmount;
	
	@FindBy(xpath="//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']")
	private WebElement addBalanceTextField;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement amountSubmitButton;

	public WebElement getCreditCardTab() {
		return creditCardTab;
	}

	public WebElement getAddAmount() {
		return addAmount;
	}

	public WebElement getAddBalanceTextField() {
		return addBalanceTextField;
	}

	public WebElement getAmountSubmitButton() {
		return amountSubmitButton;
	}
	public void performAddmoney() throws InterruptedException {
		
		getHelpCenterButton().click();
		Thread.sleep(2000);
		getCreditCardTab().click();
		Thread.sleep(2000);
		getAddAmount().click();
		Thread.sleep(2000);
		getAddBalanceTextField().sendKeys("10000");
		Thread.sleep(2000);
		getAmountSubmitButton().click();
		Thread.sleep(2000);
		
	}
	
}
	
	
