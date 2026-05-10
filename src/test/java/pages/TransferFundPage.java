package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundPage extends BasePage {
	
	public TransferFundPage(WebDriver driver)
	{
		super(driver);
	}
	
	By transferFundLink    = By.cssSelector("a[href*='transfer.htm']");
	By amountField         = By.cssSelector("input#amount");
	By fromAccountDropdown = By.cssSelector("select#fromAccountId");
	By toAccountDropdown   = By.cssSelector("select#toAccountId");
	By transferButton      = By.cssSelector("input[value='Transfer']");
	By transferFundTitle   = By.xpath("//h1[normalize-space()='Transfer Funds']");
	
	
	public void clickTransferFundLink()
	{
		click(transferFundLink);
	}
	
	public String getTransferFundTitle()
	{
		return getText(transferFundTitle);
	}
	

}
