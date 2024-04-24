package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyCoupon extends AddMoney{

	public VerifyCoupon(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//li[text()='My Wallet']")
	private WebElement myWalletButton;
	
	@FindBy(xpath="//button[text()='Use Coupon']")
	private WebElement useCouponButton;
	
	@FindBy(id="Coupon Code")
	private WebElement couponCodeTextField;
	
	@FindBy(id="Verify")
	private WebElement verifyCouponButton;

	public WebElement getMyWalletButton() {
		return myWalletButton;
	}

	public WebElement getUseCouponButton() {
		return useCouponButton;
	}

	public WebElement getCouponCodeTextField() {
		return couponCodeTextField;
	}

	public WebElement getVerifyCouponButton() {
		return verifyCouponButton;
	}
	public void performVerifyCoupon() throws InterruptedException {
		
		getAccountButton().click();
		Thread.sleep(2000);
		getMyWalletButton().click();
		Thread.sleep(2000);
		getCouponCodeTextField().sendKeys("a1b2c3");
		Thread.sleep(2000);
		getVerifyCouponButton().click();
		
	}
}
