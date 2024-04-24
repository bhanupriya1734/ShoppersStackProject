package testscripts;

import org.testng.annotations.Test;

import element_Repository.BasePage;
import element_Repository.FooterLinks;
import generic_Library.BaseTest;
import generic_Library.JavaScriptUtility;

public class Verify_User_Is_Able_Click_FooterLinks extends BaseTest{
	@Test
	
	public void footerLinksTestCase() throws InterruptedException {
		FooterLinks footerlinks=new FooterLinks(driver);
		JavaScriptUtility jsutility=new JavaScriptUtility(driver);
		jsutility.jsScrollTillWebElement(footerlinks.getHelpCenterButton());
		Thread.sleep(2000);
		footerlinks.performClickFooterLinks();
	}

}
