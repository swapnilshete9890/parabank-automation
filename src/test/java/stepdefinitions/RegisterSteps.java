package stepdefinitions;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;
import utils.ConfigReader;
import utils.DriverFactory;
import utils.TestDataUtil;

public class RegisterSteps {
	
	private static final Logger log = LogManager.getLogger(RegisterSteps.class);
	
	RegisterPage regPage;


	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		 log.info("Opening application URL");

		regPage = new RegisterPage(DriverFactory.getDriver());
		ConfigReader config = new ConfigReader();
		DriverFactory.getDriver().get(config.getBaseUrl());
	}

	@When("user clicks on register link")
	public void user_clicks_on_register_link() {

		log.info("Clicking on Register link");
		regPage.clickRegisterLink();
	}
	
	@And("user enters registration details")
	public void user_enters_registration_details(DataTable dataTable)
	{
		log.info("Entering registration details");
		
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		
		String username = data.get("username");

		if (!"testuser".equals(username)) {
		    username = TestDataUtil.generateUsername();
		}
		
		regPage.enterFirstName(data.get("firstName"));
	    regPage.enterLastName(data.get("lastName"));
	    regPage.enterAddress(data.get("address"));
	    regPage.enterCity(data.get("city"));
	    regPage.enterState(data.get("state"));
	    regPage.enterZipCode(data.get("zipCode"));
	    regPage.enterPhone(data.get("phone"));
	    regPage.enterSSN(data.get("ssn"));
	    regPage.enterUsername(username);
	    regPage.enterPassword(data.get("password"));
	    regPage.enterConfirmPassword(data.get("confirmPassword"));
				
	}

	@And("user clicks on register button")
	public void user_clicks_on_register_button() {

		regPage.clickRegisterButton(); 
	}

	@Then("user should see successful registration message")
	public void user_should_see_successful_registration_message() {

		log.info("Validating success message");
		
		 String actualMessage = regPage.getSuccessMessage();
		 
		 Assert.assertTrue(
				 actualMessage.contains("Your account was created successfully"),
				 "Expected success message not found. Actual: " + actualMessage
				 );
	}
	
	@Then("user should see error message")
	public void user_should_see_error_message() {

	    String errorMsg = regPage.getErrorMessage();

	    Assert.assertTrue(
	        errorMsg != null && !errorMsg.isEmpty(),
	        "Error message not displayed"
	    );
	}
	
	@And("user enters invalid registration details")
	public void user_enters_invalid_registration_details(DataTable dataTable)
	{
	    Map<String, String> data = dataTable.asMap(String.class, String.class);

	    if(data.get("firstName") != null && !data.get("firstName").isEmpty())
	        regPage.enterFirstName(data.get("firstName"));

	    if(data.get("lastName") != null && !data.get("lastName").isEmpty())
	        regPage.enterLastName(data.get("lastName"));

	    if(data.get("address") != null && !data.get("address").isEmpty())
	        regPage.enterAddress(data.get("address"));

	    if(data.get("city") != null && !data.get("city").isEmpty())
	        regPage.enterCity(data.get("city"));

	    if(data.get("state") != null && !data.get("state").isEmpty())
	        regPage.enterState(data.get("state"));

	    if(data.get("zipCode") != null && !data.get("zipCode").isEmpty())
	        regPage.enterZipCode(data.get("zipCode"));

	    if(data.get("phone") != null && !data.get("phone").isEmpty())
	        regPage.enterPhone(data.get("phone"));

	    if(data.get("ssn") != null && !data.get("ssn").isEmpty())
	        regPage.enterSSN(data.get("ssn"));

	    if(data.get("username") != null && !data.get("username").isEmpty())
	        regPage.enterUsername(data.get("username"));

	    if(data.get("password") != null && !data.get("password").isEmpty())
	        regPage.enterPassword(data.get("password"));

	    if(data.get("confirmPassword") != null && !data.get("confirmPassword").isEmpty())
	        regPage.enterConfirmPassword(data.get("confirmPassword"));
	}

}
