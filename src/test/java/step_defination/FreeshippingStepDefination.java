package step_defination;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import pages.Freeshiping;


public class FreeshippingStepDefination {

	

	@And("^I click on free shipping see details link$")
	public void i_click_on_free_shipping_see_details_link() throws Throwable {

		Freeshiping shipping = new Freeshiping();
		Thread.sleep(10000);
		shipping.see_details();
	}

	
	@And("^I click on standard shipping link and I search for shipping in get help search bar$")
	public void i_click_on_standard_shipping_link_and_I_search_for_shipping_in_get_help_search_bar() throws Throwable {
		Freeshiping shipping = new Freeshiping();
		//Thread.sleep(10000);
		shipping.standard_shipping();
	}


	@Then("^I should display the search results$")
	public void i_should_display_the_search_results() throws Throwable {
		Freeshiping shipping = new Freeshiping();
		//Thread.sleep(10000);
		shipping.search_result();
	   
	}


	

}
