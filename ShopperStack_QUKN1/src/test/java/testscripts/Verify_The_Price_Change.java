package testscripts;

import org.testng.annotations.Test;

import element_Repository.PriceChange;
import generic_Library.BaseTest;

public class Verify_The_Price_Change extends BaseTest {
	
	@Test
	public void priceChangeTest() throws InterruptedException {
		PriceChange pricechange=new PriceChange(driver);
		pricechange.performPriceChange(); 
		utility_Methods.takeScreenshot(driver);
		
	}
	
	
}
