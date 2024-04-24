package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount extends BasePage {

	public CreateAccount(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//span[text()='Create Account']")
	private WebElement createAccountButton;
	
	@FindBy(id="First Name")
	private WebElement firstNameTextField;
	
	@FindBy(id="Last Name")
	private WebElement lastNameTextField;
	
	@FindBy(id="Female")
	private WebElement femaleRadioButton;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumberTextField;
	
	@FindBy(id="Email Address")
	private WebElement emailAddressTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(id="Confirm Password")
	private WebElement confirmPasswordTextField;
	
	@FindBy(id="Terms and Conditions")
	private WebElement termsAndConditionsCheckbox;
	
	@FindBy(id="Register")
	private WebElement registerButton;
		
	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}
	
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}
	
	public WebElement getEmailAddressTextField() {
		return emailAddressTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}
	
	public WebElement getTermsAndConditionsCheckbox() {
		return termsAndConditionsCheckbox;
	}
	
	public WebElement getRegisterbutton() {
		return registerButton;
	}
	public void performCreateAccount(String firstname, String lastname,
			String phonenumber,String email,String password) {
		
		
		getCreateAccountButton().click();
		getFirstNameTextField().sendKeys(firstname);
		getLastNameTextField().sendKeys(lastname);
		getPhoneNumberTextField().sendKeys(phonenumber);
		getEmailAddressTextField().sendKeys(email);
		getPasswordTextField().sendKeys(password);
		getConfirmPasswordTextField().sendKeys(password);
		getRegisterbutton().click();
		
	}
}

