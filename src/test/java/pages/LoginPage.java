package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Locators
	
	By usernametxt     = By.cssSelector("input[name='username']");
	By passwordtxt     = By.cssSelector("input[name='password']");
	By loginBtn        = By.cssSelector("input[value='Log In']");
	By accOverviewPage = By.cssSelector("#overviewAccountsApp");
	By errorMsg        = By.cssSelector("#rightPanel p.error");
	
	
	//Actions Method
	
	public void enterUsername(String user)
	{
		type(usernametxt, user);
	}
	
	public void enterPassword(String pass)
	{
		type(passwordtxt, pass);
	}
	
	public void clickLoginBtn()
	{
		click(loginBtn);
	}
	
	public boolean isLoginSuccessful()
	{
		return getText(accOverviewPage).contains("Accounts Overview");
	}
	
	public boolean isErrorDisplayed()
	{
	  try
	  {
		  wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg));
		  return true;
	  }
	  catch(Exception e)
	  {
		  return false;
	  }
	}

}
