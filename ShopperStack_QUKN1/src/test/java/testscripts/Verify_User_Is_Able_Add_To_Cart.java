package testscripts;

import org.testng.annotations.Test;

import element_Repository.AddToCart;
import generic_Library.BaseTest;

public class Verify_User_Is_Able_Add_To_Cart extends BaseTest {
	
	@Test 
	public void addToCartTestCase() throws InterruptedException {
		AddToCart addtocart=new AddToCart(driver);
		addtocart.performAddtoCart();
		utility_Methods.takeScreenshot(driver);
	}
}
