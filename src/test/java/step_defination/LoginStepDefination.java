package step_defination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.Login;
import pages.Signup;

public class LoginStepDefination {
	
	
	@When("^I click on login link$")
	public void i_click_on_login_link() throws Throwable {
		Signup sign = new Signup();	
		sign.join();
		Thread.sleep(1000);
	}

	@And("^I need to provide the user details to login$")
	public void i_need_to_provide_the_user_details_to_login() throws Throwable {
		Login login = new Login();	
		login.login_details();
		Thread.sleep(1000);
	}



}
