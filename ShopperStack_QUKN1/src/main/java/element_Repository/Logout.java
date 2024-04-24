package element_Repository;

import org.openqa.selenium.WebDriver;

public class Logout extends BasePage{

	public Logout(WebDriver driver) {
		super(driver);
		
	}
	
	public void perfromLogout() {
		
		getAccountButton().click();
		getLogoutButton().click();
	}
	
}
