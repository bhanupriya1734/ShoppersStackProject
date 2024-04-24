package testscripts;

import org.testng.annotations.Test;

import element_Repository.UpdateOrModify;
import generic_Library.BaseTest;

public class Verify_If_User_Is_Able_To_Update_Modify extends BaseTest {
	
	@Test
	public void updateOrModifyTestCase() throws InterruptedException  {
		
				
			UpdateOrModify updateormodify=new UpdateOrModify(driver);
			updateormodify.performUpdateOrModify();
			utility_Methods.takeScreenshot(driver);
		}
	
	
}
