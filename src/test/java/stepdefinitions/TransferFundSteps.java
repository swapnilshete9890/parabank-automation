package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TransferFundPage;
import utils.DriverFactory;

public class TransferFundSteps {

	TransferFundPage tf = new TransferFundPage(DriverFactory.getDriver());

	@When("user clicks on Transfer Funds link")
	public void user_clicks_on_transfer_funds_link() {

		tf.clickTransferFundLink();

	}

	@Then("user should see Transfer Funds page")
	public void user_should_see_transfer_funds_page() {

		Assert.assertEquals(tf.getTransferFundTitle(), "Transfer Funds");
	}

	@Then("user should see amount field, from account dropdown, to account dropdown and transfer button")
	public void user_should_see_amount_field_from_account_dropdown_to_account_dropdown_and_transfer_button() {

		Assert.assertTrue(tf.isAmountFieldDisplayed());
		Assert.assertTrue(tf.isFromAccountDropdownDisplayed());
		Assert.assertTrue(tf.isToAccountDropdownDisplayed());
		Assert.assertTrue(tf.isTransferButtonDisplayed());
	}

	@And("user enters amount")
	public void user_enters_amount() {
		tf.enterAmount("1000");
	}

	@And("user selects account number from from account and to account dropdown")
	public void user_selects_account_number_from_from_account_and_to_account_dropdown() {

		tf.selectFromAccount();
		tf.selectToAccount();
	}

	@And("user clicks on Transfer button")
	public void user_clicks_on_transfer_button() {

		tf.clickTransferButton();

	}

	@Then("user should see successful transfer message")
	public void user_should_see_successful_transfer_message() {

		Assert.assertEquals(tf.getTransferCompleteTitle(), "Transfer Complete!");
		System.out.println(tf.getTransferMessage());

	}

}
