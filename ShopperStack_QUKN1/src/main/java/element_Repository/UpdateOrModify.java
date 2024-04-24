package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateOrModify extends BasePage{
	
	public UpdateOrModify(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="cartIcon")
	private WebElement cartIcon;
	
	@FindBy(xpath="//*[local-name()='svg' and @id='increase']/*[local-name()='path']")
	private WebElement decreaseIcon;
	
	@FindBy(xpath="//*[local-name()='svg' and @id='decrease']/*[local-name()='path']")
	private WebElement increaseIcon;

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getDecreaseIcon() {
		return decreaseIcon;
	}

	public WebElement getIncreaseIcon() {
		return increaseIcon;
	}

	public void performUpdateOrModify() throws InterruptedException {
		
		getCartIcon().click();
		Thread.sleep(5000);
		getIncreaseIcon().click();
		Thread.sleep(5000);
		getDecreaseIcon().click();
		
	}
}
