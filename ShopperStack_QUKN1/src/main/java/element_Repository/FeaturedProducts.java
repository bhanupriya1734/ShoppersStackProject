package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeaturedProducts extends BasePage{
	
	public FeaturedProducts(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="kidsProd")
	private WebElement kidsFeaturedProducts;
	
	@FindBy(id="mensProd")
	private WebElement menFeaturedProducts;
	
	@FindBy(id="womensProd")
	private WebElement womenFeaturedProducts;
	
	@FindBy(id="electronicsProd")
	private WebElement electronicsFeaturedProducts;
	
	@FindBy(id="beautyProd")
	private WebElement beautyFeaturedProducts;
	
	@FindBy(xpath="//a[text()='Home']")
	private WebElement homePageLogo;
	
	@FindBy(xpath="//h1[text()='Featured Products']")
	private WebElement featuredProducts;
	
	public WebElement getHomePageLogo() {
		return homePageLogo;
	}

	public WebElement getFeaturedProducts() {
		return featuredProducts;
	}

	public WebElement getKidsFeaturedProducts() {
		return kidsFeaturedProducts;
	}


	public WebElement getMenFeaturedProducts() {
		return menFeaturedProducts;
	}


	public WebElement getWomenFeaturedProducts() {
		return womenFeaturedProducts;
	}


	public WebElement getElectronicsFeaturedProducts() {
		return electronicsFeaturedProducts;
	}


	public WebElement getBeautyFeaturedProducts() {
		return beautyFeaturedProducts;
	}


	public void performFeaturedProducts() throws InterruptedException {
		
		getKidsFeaturedProducts().click();
		Thread.sleep(2000);
		getHomePageLogo().click();
		Thread.sleep(2000);
		getMenFeaturedProducts().click();
		Thread.sleep(2000);
		getHomePageLogo().click();
		Thread.sleep(2000);
		getWomenFeaturedProducts().click();
		Thread.sleep(2000);
		getHomePageLogo().click();
		Thread.sleep(2000);
		getElectronicsFeaturedProducts().click();
		Thread.sleep(2000);
		getHomePageLogo().click();
		Thread.sleep(2000);
		getBeautyFeaturedProducts().click();
		
	}
}
