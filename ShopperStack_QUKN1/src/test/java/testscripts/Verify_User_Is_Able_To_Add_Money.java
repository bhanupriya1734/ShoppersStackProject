package testscripts;

import org.testng.annotations.Test;

import element_Repository.AddMoney;
import generic_Library.BaseTest;
import generic_Library.JavaScriptUtility;

public class Verify_User_Is_Able_To_Add_Money extends BaseTest {
	@Test
	public void addMoneyTestCase() throws InterruptedException {
		AddMoney addmoney=new AddMoney(driver);
		JavaScriptUtility jsutility=new JavaScriptUtility(driver);
		jsutility.jsScrollTillWebElement(addmoney.getHelpCenterButton());
		Thread.sleep(4000);
		addmoney.performAddmoney();
		
	}

}
