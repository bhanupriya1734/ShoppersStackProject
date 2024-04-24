 package testscripts;

import org.testng.annotations.Test;

import element_Repository.AddAddress;
import generic_Library.BaseTest;
import generic_Library.JavaScriptUtility;

public class Verify_User_Is_Able_To_Add_Address extends BaseTest{
	
	@Test
	public void addAddressTestCase() throws InterruptedException{
		
		AddAddress addaddress =new AddAddress(driver);
		JavaScriptUtility jsutility=new JavaScriptUtility(driver);
		addaddress.perfromAddAddress();
		jsutility.jsScrollTillWebElement(addaddress.getAddAddressSubmitButton());
		Thread.sleep(2000);		
		addaddress.getAddAddressSubmitButton().click();
		Thread.sleep(2000);
		utility_Methods.takeScreenshot(driver);

		
		}
}
