package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainSubCategories extends BasePage{

	public MainSubCategories(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[text()='Home']")
	private WebElement homeClickButton;
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement womenTab;
	
	@FindBy(xpath="//a[text()='Kids']")
	private WebElement kidsTab;
	
	@FindBy(xpath="//a[text()='Beauty']")
	private WebElement beautyTab;

	public WebElement getWomenTab() {
		return womenTab;
	}

	public WebElement getKidsTab() {
		return kidsTab;
	}

	public WebElement getBeautyTab() {
		return beautyTab;
	}
	
	public WebElement getHomeClickButton() {
		return homeClickButton;
	}
	public void performClickOnMainSubCategories() throws InterruptedException {
		
		
		getMenTab().click();
		Thread.sleep(5000);
		getHomeClickButton().click();
		Thread.sleep(5000);
		getWomenTab().click();
		Thread.sleep(5000);
		getHomeClickButton().click();
		Thread.sleep(5000);
		getKidsTab().click();
		Thread.sleep(5000);
		getHomeClickButton().click();
		Thread.sleep(5000);
		getElectronicTab().click();
		Thread.sleep(5000);
		getHomeClickButton().click();
		Thread.sleep(5000);
		getBeautyTab().click();
		Thread.sleep(5000);
		
	}
}
