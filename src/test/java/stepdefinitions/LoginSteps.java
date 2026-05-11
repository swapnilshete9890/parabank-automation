package stepdefinitions;

import java.sql.Driver;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
	
	LoginPage lp= new LoginPage(DriverFactory.getDriver());

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
