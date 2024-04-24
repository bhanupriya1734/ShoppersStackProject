package testscripts;

import org.testng.annotations.Test;

import element_Repository.MessageUs;
import generic_Library.BaseTest;

public class Verify_User_Is_Able_To_Use_Message_Us extends BaseTest{
	
	@Test
	public void messageUs1TestCase() throws InterruptedException {
		MessageUs messageus=new MessageUs(driver);
		messageus.performMessageUs();
	}

}
