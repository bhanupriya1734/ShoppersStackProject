package element_Repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import element_Repository.BasePage;

public class PriceChange extends BasePage{

	public PriceChange(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//span[text()='Total Price']")
	private WebElement totalPrice;
	
	@FindBy(xpath="//span[text()='Total Price']/..//span[2]")
	private WebElement totalPriceamount1;
	
	@FindBy(xpath="//span[text()='Total Price']/..//span[2]")
	private WebElement totalPriceamount2;
	
	@FindBy(xpath="//button[text()='Remove from cart']")
	private WebElement removeFromCartCartButton;
	
	@FindBy(xpath="//button[text()='Yes']")
	private WebElement clickYesOnRemoveButton;
	
	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public WebElement getTotalPriceamount1() {
		return totalPriceamount1;
	}
	public WebElement getTotalPriceamount2() {
		return totalPriceamount2;
	}

	public WebElement getRemoveFromCartCartButton() {
		return removeFromCartCartButton;
	}

	public WebElement getClickYesOnRemoveButton() {
		return clickYesOnRemoveButton;
	}

	public void performPriceChange() throws InterruptedException {
		
		getCartIcon().click();
		Thread.sleep(5000);
		/*
		 * Print the total price before the remove button
		 */
		System.out.println(getTotalPriceamount1());
		getRemoveFromCartCartButton().click();
		Thread.sleep(2000);
		getClickYesOnRemoveButton().click();
		Thread.sleep(2000);
		/*
		 * 	 * Print the total price before the remove button

		 */
		System.out.println(getTotalPriceamount2());
	}
}
