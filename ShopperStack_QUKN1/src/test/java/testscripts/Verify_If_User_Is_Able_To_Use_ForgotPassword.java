package testscripts;

import org.testng.annotations.Test;

import element_Repository.ForgotPassword;
import element_Repository.LoginPage;
import generic_Library.BaseTest;

public class Verify_If_User_Is_Able_To_Use_ForgotPassword extends BaseTest{
	
	@Test
	public void forgotPasswordTestCase() {
		
		ForgotPassword forgot_password= new ForgotPassword(driver);
		forgot_password.performForgotPassword(email_Key);
		/*
		 * TestScript Cannot be executed because PerformLogin will execute before 
		 * performForgotPassword Method.     	
		 */
		
	}

}
