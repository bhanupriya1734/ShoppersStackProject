package testscripts;

import org.testng.annotations.Test;

import element_Repository.VerifyCoupon;
import generic_Library.BaseTest;

public class Verify_User_Is_Able_To_VerifyCoupon extends BaseTest{
	
	@Test
	public void verifyCouponTestCase() throws InterruptedException {
		
		VerifyCoupon verifycoupon=new VerifyCoupon(driver);
		verifycoupon.performVerifyCoupon();
		utility_Methods.takeScreenshot(driver);

	}

}
