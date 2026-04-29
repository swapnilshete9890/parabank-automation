package stepdefinitions;

import io.cucumber.java.en.Given;
import utils.ConfigReader;
import utils.DriverFactory;

public class CommonSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {

		ConfigReader config = new ConfigReader();
		DriverFactory.getDriver().get(config.getBaseUrl());
	}

}
