package testscripts;

import org.testng.annotations.Test;
import element_Repository.SearchButton;
import generic_Library.BaseTest;

public class Verify_If_User_Is_Able_To_Search extends BaseTest{
	
	@Test
	public void searchTestCase() throws InterruptedException {
		
		SearchButton searchbutton=new SearchButton(driver);
		searchbutton.performSearch(); 
		utility_Methods.takeScreenshot(driver);
	
	}

}
