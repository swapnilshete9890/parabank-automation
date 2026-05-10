package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverFactory;

public class CommonSteps {
	
	LoginPage lp;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {

		ConfigReader config = new ConfigReader();
		DriverFactory.getDriver().get(config.getBaseUrl());
	}
	
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() 
	{
		lp = new LoginPage(DriverFactory.getDriver());
		ConfigReader config = new ConfigReader();
	    lp.enterUsername(config.getUsername());
	    lp.enterPassword(config.getPassword());
	    
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
	  lp.clickLoginBtn();
	}

}
