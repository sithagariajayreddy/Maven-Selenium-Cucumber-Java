package step_defination;

import cucumber.api.java.en.And;
import pages.AddItem;

public class AddItemStepDefination {
	
	
	
	@And("^I click on mens shoes$")
	public void i_click_on_mens_shoes() throws Throwable {
		AddItem add = new AddItem();
		add.best_seller();
	   //Thread.sleep(2000);
	}


	@And("^I add the item to cart$")
	public void i_add_the_item_to_cart() throws Throwable {
		AddItem add = new AddItem();
		add.cart();
		Thread.sleep(2000);
	   
	}

	@And("^I select the size of the item and then I checkout the item$")
	public void i_select_the_size_of_the_item_and_then_I_checkout_the_item() throws Throwable {
		AddItem add = new AddItem();
		add.checkout();
		Thread.sleep(2000);
	    
	}




}
