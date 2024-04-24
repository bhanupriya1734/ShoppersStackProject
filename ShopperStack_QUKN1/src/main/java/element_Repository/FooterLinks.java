package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterLinks extends AddOrRemove{

	public FooterLinks(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[text()='facebook']")
	private WebElement faceBookFooterLink;
	
	@FindBy(xpath="//a[text()='twitter']")
	private WebElement twitterFooterLink;
	
	@FindBy(xpath="//a[text()='youTube']")
	private WebElement youtubeFooterLink;

	public WebElement getFaceBookFooterLink() {
		return faceBookFooterLink;
	}

	public WebElement getTwitterFooterLink() {
		return twitterFooterLink;
	}

	public WebElement getYoutubeFooterLink() {
		return youtubeFooterLink;
	}
	
	
	public void performClickFooterLinks() throws InterruptedException {
		
		
		getFaceBookFooterLink().click();
		Thread.sleep(2000);
		getTwitterFooterLink().click();
		Thread.sleep(2000);
		getYoutubeFooterLink().click();
		Thread.sleep(2000);
		
	}
}
