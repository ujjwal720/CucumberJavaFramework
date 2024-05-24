package Utilities;

import org.openqa.selenium.WebDriver;

public class ObjectManager {

	public WebDriver driver;

	public ObjectManager(WebDriver driver) {
		
		this.driver=driver;
		

	}
	
	
	public PageObjects.LoginPage LoginPage() {
		
		return new PageObjects.LoginPage(driver);
		
		
	}
	
	

}
