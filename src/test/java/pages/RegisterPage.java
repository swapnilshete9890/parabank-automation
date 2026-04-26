package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterPage extends BasePage {
	
	
	public RegisterPage(WebDriver driver)
	{
		super(driver);	
	}
	
	 //Locators

    By registerLink = By.linkText("Register");
    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By address = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zipCode = By.id("customer.address.zipCode");
    By phone = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By username = By.id("customer.username");
    By password = By.id("customer.password");
    By confirmPassword = By.id("repeatedPassword");
    By registerButton = By.cssSelector("input[value='Register']");
    By successMessage = By.xpath("//*[contains(text(),'Your account was created successfully')]");
    By errorMsg = By.xpath("//*[contains(text(),'error') or contains(text(),'Error')]");


	//Action Methods
    
	public void clickRegisterLink()
	{
		click(registerLink);
	}
	
	public void enterFirstName(String fname)
	{
		type(firstName, fname);
	}
	
	public void enterLastName(String lname)
	{
		type(lastName, lname);
	}
	
	public void enterAddress(String addr)
	{
		type(address, addr);
	}
	
	public void enterCity(String cityName)
	{
		type(city, cityName);
	}
	
	public void enterState(String stateName)
	{
		type(state, stateName);
	}
	
	public void enterZipCode(String zip)
	{
		type(zipCode, zip);
	}
	
	public void enterPhone(String phoneNum)
	{
		type(phone, phoneNum);
	}
	
	public void enterSSN(String ssnNum)
	{
		type(ssn, ssnNum);
	}
	
	public void enterUsername(String user)
	{
		type(username, user);
	}
	
	public void enterPassword(String pass)
	{
		type(password, pass);
	}
	
	public void enterConfirmPassword(String confirmPass)
	{
		type(confirmPassword, confirmPass);
	}
	
	public void clickRegisterButton()
	{
		click(registerButton);
	}
	
	public boolean isRegistrationSuccessful() 
	{
	   return getText(successMessage).contains("Your account was created successfully");
	}
	
	public String getSuccessMessage()
	{
		return getText(successMessage);
	}

	public String getErrorMessage() 
	{
	    return getText(errorMsg);
	}

}
