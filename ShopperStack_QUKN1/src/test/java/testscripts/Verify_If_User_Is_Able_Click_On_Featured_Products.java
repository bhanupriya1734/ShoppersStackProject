package testscripts;

import org.testng.annotations.Test;

import element_Repository.FeaturedProducts;
import generic_Library.BaseTest;
import generic_Library.JavaScriptUtility;

public class Verify_If_User_Is_Able_Click_On_Featured_Products  extends BaseTest{
	@Test
	public void featuredProductsTestCase() throws InterruptedException {
		
		FeaturedProducts featuredproducts=new FeaturedProducts(driver);
		JavaScriptUtility jsutility=new JavaScriptUtility(driver);
		jsutility.jsScrollTillWebElement(featuredproducts.getFeaturedProducts());
		featuredproducts.getKidsFeaturedProducts().click();
		Thread.sleep(2000);
		featuredproducts.getHomePageLogo().click();
		Thread.sleep(2000);
		jsutility.jsScrollTillWebElement(featuredproducts.getFeaturedProducts());
		Thread.sleep(2000);
		featuredproducts.getMenFeaturedProducts().click();
		Thread.sleep(2000);
		featuredproducts.getHomePageLogo().click();
		Thread.sleep(2000);
		jsutility.jsScrollTillWebElement(featuredproducts.getFeaturedProducts());
		Thread.sleep(2000);
		featuredproducts.getWomenFeaturedProducts().click();
		Thread.sleep(2000);
		featuredproducts.getHomePageLogo().click();
		Thread.sleep(2000);
		jsutility.jsScrollTillWebElement(featuredproducts.getFeaturedProducts());
		Thread.sleep(2000);
		featuredproducts.getElectronicsFeaturedProducts().click();
		Thread.sleep(2000);
		jsutility.jsScrollTillWebElement(featuredproducts.getHomePageLogo());
		featuredproducts.getHomePageLogo().click();
		Thread.sleep(2000);
		jsutility.jsScrollTillWebElement(featuredproducts.getFeaturedProducts());
		Thread.sleep(2000);
		featuredproducts.getBeautyFeaturedProducts().click();
		Thread.sleep(2000);
		utility_Methods.takeScreenshot(driver);
		
	}

}
