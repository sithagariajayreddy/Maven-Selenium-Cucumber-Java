package step_defination;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import utils.BrowserandDriver;

public class CommonStepDefination {
	
	// URL of an application
		String PageURL = "http://www.nike.com/us/en_us/";
		
		// If element will not available then script will wait for an element as per the given time
		int ImplicitWait = 20;
		
		// If page will take more than given time then the test case will fail at that point of time
		int pageLoadTimeOut = 50;
		
		// Browser will start on the basis of provided value (firefox, chrome, ie, safari)
		String browserName = "chrome";
		
		//BrowserandDriver BD = new BrowserandDriver();
		
		
		@Before
		public void launchBrowser()
		{
			BrowserandDriver.launchBrowser(browserName);
			BrowserandDriver.maximizeBrowser();
			BrowserandDriver.setImplicitWait(ImplicitWait);
			BrowserandDriver.setPageLoadTimeout(pageLoadTimeOut);
		}	
	
	    @Given("^I am landing on nike homepage$")
	    public void i_am_landing_on_nike_homepage() throws Throwable {
	    	BrowserandDriver.launchApp(PageURL);
	    }
	
	
	    @After
        public void tearDown(Scenario scenario) {
	    	BrowserandDriver.tearDown(scenario);
        }
	
	

}
