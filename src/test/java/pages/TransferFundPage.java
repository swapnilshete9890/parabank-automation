package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundPage extends BasePage {
	
	public TransferFundPage(WebDriver driver)
	{
		super(driver);
	}
	
	By transferFundLink      = By.cssSelector("a[href*='transfer.htm']");
	By amountField           = By.cssSelector("input#amount");
	By fromAccountDropdown   = By.cssSelector("select#fromAccountId");
	By toAccountDropdown     = By.cssSelector("select#toAccountId");
	By transferButton        = By.cssSelector("input[value='Transfer']");
	By transferFundTitle     = By.xpath("//h1[normalize-space()='Transfer Funds']");
	By transferCompleteTitle = By.xpath("//h1[@class='title'][contains(text(),'Transfer Complete')]");
	By transferMessage       = By.xpath("//*[@id='showResult']/p[1]");
	
	
	public void clickTransferFundLink()
	{
		click(transferFundLink);
	}
	
	public String getTransferFundTitle()
	{
		return getText(transferFundTitle);
	}
	
	public boolean isAmountFieldDisplayed()
	{
		return isDisplayed(amountField);
	}
	
	public boolean isFromAccountDropdownDisplayed()
	{
		return isDisplayed(fromAccountDropdown);
	}
	
	public boolean isToAccountDropdownDisplayed()
	{
		return isDisplayed(toAccountDropdown);
	}
	
	public boolean isTransferButtonDisplayed()
	{
		return isDisplayed(transferButton);
	}
	
	public void enterAmount(String amount)
	{
       type(amountField, amount);
	}
	
	public void selectFromAccount()
	{
		selectByIndex(fromAccountDropdown, 1);
	}
	
	public void selectToAccount()
	{
		selectByIndex(toAccountDropdown, 2);
	}
	
	public void clickTransferButton()
	{
		click(transferButton);
	}
	
	public String getTransferCompleteTitle()
	{
		return getText(transferCompleteTitle);
	}

	public String getTransferMessage()
	{
		return getText(transferMessage);
	}
	
	

}
