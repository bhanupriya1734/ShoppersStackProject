package testscripts;

import org.testng.annotations.Test;

import element_Repository.CreditCardDebitCard;
import generic_Library.BaseTest;

public class Verify_User_Is_Able_To_Add_Card extends BaseTest{

	@Test
	public void addCardTestCase() throws InterruptedException {
		CreditCardDebitCard creaditcarddebitcard=new CreditCardDebitCard(driver);
		creaditcarddebitcard.performAddCard();
		Thread.sleep(2000);
		utility_Methods.takeScreenshot(driver);
		
			
	}
}

