package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddOrRemove extends BasePage {

	public AddOrRemove(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//li[text()='Wish List']")
	private WebElement wishListButton;
	
	@FindBy(xpath="//button[text()='remove from wishlist?'][1]")
	private WebElement removeFromWishListButton;
		
	@FindBy(xpath="//*[local-name()='svg' and @data-testid='FavoriteIcon']/*[local-name()='path'][1]")
	private WebElement heartIcon;
	
	@FindBy(id="beautyProducts")
	private WebElement beautyTab;
	
	
	public WebElement getBeautyTab() {
		return beautyTab;
	}

	public WebElement getHeartIcon() {
		return heartIcon;
	}

	public WebElement getWishListButton() {
		return wishListButton;
	}

	public WebElement getRemoveFromWishListButton() {
		return removeFromWishListButton;
	}

	public void performAddOrRemove() throws InterruptedException {
		
		getBeautyTab().click();
		Thread.sleep(2000);
		getHeartIcon().click();
		Thread.sleep(2000);
		getAccountButton().click();
		Thread.sleep(2000);
		getWishListButton().click();
		Thread.sleep(2000);
		getRemoveFromWishListButton().click();
		Thread.sleep(2000);
		/*
		 * switch control to alert
		 */
		
		
	}
	
}
