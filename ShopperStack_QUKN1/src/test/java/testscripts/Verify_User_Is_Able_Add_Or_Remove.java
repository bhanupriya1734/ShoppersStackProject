package testscripts;

import org.testng.annotations.Test;

import element_Repository.AddOrRemove;
import generic_Library.BaseTest;

public class Verify_User_Is_Able_Add_Or_Remove extends BaseTest{
	
	@Test
	public void addOrRemoveTestCase() throws InterruptedException {
		
		AddOrRemove addorremove=new AddOrRemove(driver);
		addorremove.performAddOrRemove();
		utility_Methods.acceptAlert(driver);
		utility_Methods.takeScreenshot(driver);
		
	}

}
