package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverFactory;

public class LoginSteps {
	
	LoginPage lp;
	
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() 
	{
		lp = new LoginPage(DriverFactory.getDriver());
		ConfigReader config = new ConfigReader();
		DriverFactory.getDriver().get(config.getBaseUrl());
		
	    lp.enterUsername(config.getUsername());
	    lp.enterPassword(config.getPassword());
	    
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
	  lp.clickLoginBtn();
	}

	@Then("user should be redirected to Accounts Overview page")
	public void user_should_be_redirected_to_accounts_overview_page() 
	{
		Assert.assertTrue(lp.isLoginSuccessful(), "Login Failed");
		
	}
	
	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String username, String password) 
	{
		lp = new LoginPage(DriverFactory.getDriver());
	    lp.enterUsername(username);
	    lp.enterPassword(password);
	}

	@Then("user should see login error message")
	public void user_should_see_login_error_message() 
	{
	    Assert.assertTrue(lp.isErrorDisplayed(), "Error message not displayed");
	}

}
