package testscripts;

import org.testng.annotations.Test;

import element_Repository.MainSubCategories;
import generic_Library.BaseTest;

public class Verify_User_Is_Able_To_View_Main_Sub_Categories extends BaseTest{
	@Test
	public void mainSubCategoriesTestCase() throws InterruptedException {
		
		MainSubCategories mainsubcategories=new MainSubCategories(driver);
		mainsubcategories.performClickOnMainSubCategories();
		utility_Methods.takeScreenshot(driver);
	}

}
