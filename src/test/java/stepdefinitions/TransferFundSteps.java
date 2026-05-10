package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TransferFundPage;

public class TransferFundSteps {
	
	TransferFundPage tf;
	
	@When("user clicks on Transfer Funds option")
	public void user_clicks_on_transfer_funds_option() {
		
		tf.clickTransferFundLink();
	  
	}

	@Then("user should see Transfer Funds page")
	public void user_should_see_transfer_funds_page() {
		
		Assert.assertEquals(tf.getTransferFundTitle(), "Transfer Funds");
	 
	}

}
