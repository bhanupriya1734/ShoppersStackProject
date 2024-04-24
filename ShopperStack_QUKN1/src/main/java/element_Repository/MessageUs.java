package element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessageUs extends BasePage{

	public MessageUs(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className="chatbot-items")
	private WebElement chatBotitemsButton;
	
	@FindBy(xpath="//p[text()='1. Delivery issues.']")
	private WebElement deliveryIssuesButton;
	
	@FindBy(id="chat_input") 
	private WebElement chatInputTextField;
	
	@FindBy(className="chat_send_arrow")
	private WebElement chatSendArrow;

	
	public WebElement getChatBotitemsButton() {
		return chatBotitemsButton;
	}

	public WebElement getDeliveryIssuesButton() {
		return deliveryIssuesButton;
	}
	
	public WebElement getChatInputTextField() {
		return chatInputTextField;
	}

	public WebElement getChatSendArrow() {
		return chatSendArrow;
	}

	public void performMessageUs() throws InterruptedException {
		
		getChatBotitemsButton().click();
		Thread.sleep(2000);
		getDeliveryIssuesButton().click();
		Thread.sleep(2000);
		getChatInputTextField().sendKeys("delivery issues");
		Thread.sleep(2000);
		getChatSendArrow().click();
		Thread.sleep(2000);
		getChatInputTextField().sendKeys("9798959682");
		Thread.sleep(2000);
		getChatSendArrow().click();
		Thread.sleep(2000);
		getChatInputTextField().sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		getChatSendArrow().click();
		Thread.sleep(2000);
		getChatInputTextField().sendKeys("12-12-1998");
		Thread.sleep(2000);
		getChatSendArrow().click();
		Thread.sleep(2000);
		getChatInputTextField().sendKeys("10:10");
		Thread.sleep(2000);
		getChatSendArrow().click();
	}
}
