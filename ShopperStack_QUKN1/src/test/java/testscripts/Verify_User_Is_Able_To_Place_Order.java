package testscripts;

import org.testng.annotations.Test;

import element_Repository.PlaceOrder;
import generic_Library.BaseTest;

public class Verify_User_Is_Able_To_Place_Order extends BaseTest{
	
	@Test
	public void placeOrderTestCase() throws InterruptedException {
		PlaceOrder placeorder=new PlaceOrder(driver);
		placeorder.performPlaceOrder();
		utility_Methods.takeScreenshot(driver);
	}
}
