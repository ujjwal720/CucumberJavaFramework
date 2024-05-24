package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	/*
	 * Page Class for the Login Page  
	 */

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;

	public void email(String key) {

		email.sendKeys(key);

	}

	public void pass(String s) {

		password.sendKeys(s);
		
	}
	
	
	

}
