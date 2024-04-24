package testscripts;

import org.testng.annotations.Test;

import element_Repository.ProfileUpdate;
import generic_Library.BaseTest;

public class Verify_User_Is_Able_To_Edit_Profile extends BaseTest{
	
	@Test
	public void profileUpdate() throws InterruptedException {
		ProfileUpdate profileupdate=new ProfileUpdate(driver);
		profileupdate.performEditProfile();
		Thread.sleep(5000);
		utility_Methods.acceptAlert(driver);
		utility_Methods.takeScreenshot(driver);
	}

}
