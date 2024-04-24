package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchButton extends BasePage {

	public SearchButton(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="search")
	private WebElement searchTextField;
	
	@FindBy(id="searchBtn")
	private WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	public void performSearch() throws InterruptedException   {
		
		getSearchTextField().sendKeys("Men");
		Thread.sleep(2000);
		getSearchButton().click();
		Thread.sleep(2000);
		getSearchTextField().sendKeys("Women");
		Thread.sleep(2000);
		getSearchButton().click();
		Thread.sleep(2000);
		getSearchTextField().sendKeys("Electronic");
		Thread.sleep(2000);
		getSearchButton().click();
		Thread.sleep(2000);
		getSearchTextField().sendKeys("kids");
		Thread.sleep(2000);
		getSearchButton().click();
		Thread.sleep(2000);
		getSearchTextField().sendKeys("Beauty");
		Thread.sleep(2000);
		getSearchButton().click();
		
		
	}
	
}
