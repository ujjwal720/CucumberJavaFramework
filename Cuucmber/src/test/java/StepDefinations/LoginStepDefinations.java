package StepDefinations;

import Utilities.ObjectManager;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LoginStepDefinations {
	
	public TestContext a;
	public PageObjects.LoginPage LoginPage;
	public ObjectManager manager;

	public LoginStepDefinations(TestContext a) {
		
		this.a=a;
		LoginPage=a.manager.LoginPage();
		

	}
	
	/*
	 * bdd framework
	 */

	@Given("the user is in the Login Page")
	public void the_user_is_in_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.email("us@gmail.com");
	
	}

	@And("the user enters the valid username and password")
	public void the_user_enters_the_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.pass("password");
	    
	}


}
