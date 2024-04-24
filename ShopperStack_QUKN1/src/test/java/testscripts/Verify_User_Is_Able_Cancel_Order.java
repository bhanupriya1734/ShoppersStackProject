package testscripts;

import org.testng.annotations.Test;

import element_Repository.CancelOrder;
import generic_Library.BaseTest;

public class Verify_User_Is_Able_Cancel_Order extends BaseTest{

	@Test
	public void cancelOrderTestCase() throws InterruptedException {
		CancelOrder cancelorder=new CancelOrder(driver);
		cancelorder.perfromCancelOrder();
		utility_Methods.takeScreenshot(driver);
	}
}
