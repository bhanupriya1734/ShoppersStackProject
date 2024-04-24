package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends BasePage{

	
	public ForgotPassword(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[text()='Forgot Password?']")
	private WebElement forgotPasswordLink;
	
	@FindBy(id="email-label")
	private WebElement ForgotPasswordEmailTextField;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement forgotPasswordProceedButton;

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getForgotPasswordEmailTextField() {
		return ForgotPasswordEmailTextField;
	}
	
	public WebElement forgotPasswordProceedButton() {
		return forgotPasswordProceedButton;
	}
	
	public void performForgotPassword(String email) {
		
		getForgotPasswordLink().click();
		getForgotPasswordEmailTextField().sendKeys(email);
		forgotPasswordProceedButton().click();
		
	}
}
