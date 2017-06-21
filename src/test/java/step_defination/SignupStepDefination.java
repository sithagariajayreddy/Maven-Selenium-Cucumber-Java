package step_defination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Signup;

public class SignupStepDefination {
	
	 
    @When("^I click on join now$")
	public void i_click_on_join_now() throws Throwable {
		Signup sign = new Signup();	
		sign.join();
		Thread.sleep(1000);
		sign.join_now();
		Thread.sleep(1000);
    }
    
	@And("^I provide the user details to join$")
	public void i_provide_the_user_details_to_join() throws Throwable {
		Signup sign = new Signup();
		//Thread.sleep(1000);
		sign.user_details();
		Thread.sleep(1000);
	
	}

	@Then("^I need to see the current page url$")
	public void i_need_to_see_the_current_page_url() throws Throwable {
	
		Signup sign = new Signup();
		sign.current_url();
		Thread.sleep(1000);
		System.out.println("The current Page URL:" + sign.current_url());
		Thread.sleep(2000);
	   
	}





	

}
