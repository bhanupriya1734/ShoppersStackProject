package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends BasePage{

	public AddToCart(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath="//a[text()='Mobiles']")
	private WebElement mobileLink;
	
	@FindBy(xpath="//a[text()='Laptops ']")
	private WebElement laptopslink;
		
	@FindBy(xpath="//span[text()='APPLE iPhone 14 Pro']")
	private WebElement mobileProductsNameLink; 
	
	@FindBy(xpath="//span[text()='APPLE 2021 Macbook Pro M1 Max']")
	private WebElement laptopsProductNameLink;
	
	@FindBy(xpath="//span[text()='add to cart']")
	private WebElement addtoCartButton;
	
	
	public WebElement getMobileLink() {
		return mobileLink;
	}
	public WebElement getLaptopslink() {
		return laptopslink;
	}
	
	public WebElement getMobileProductsNameLink() {
		return mobileProductsNameLink;
	}
	public WebElement getLaptopsProductNameLink() {
		return laptopsProductNameLink;
	}
	public WebElement getAddtoCartButton() {
		return addtoCartButton;
	}
	
	public  void performAddtoCart() throws InterruptedException {
		
		getElectronicTab().click();
		Thread.sleep(2000);
		getMobileLink().click();
		Thread.sleep(2000);
		getMobileProductsNameLink().click();
		Thread.sleep(2000);
		getAddtoCartButton().click();
		Thread.sleep(2000);
		getElectronicTab().click();
		Thread.sleep(2000);
		getLaptopslink().click();
		Thread.sleep(2000);
		getLaptopsProductNameLink().click();
		Thread.sleep(2000);
		getAddtoCartButton().click();
		Thread.sleep(2000);
		getCartIcon().click();
		Thread.sleep(2000);
		
		
	}

}
