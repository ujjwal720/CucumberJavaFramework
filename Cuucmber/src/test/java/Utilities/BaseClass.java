package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver=null;;

	public WebDriver setup() {

		if (driver == null) {

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://practicesoftwaretesting.com/#/auth/login");
			driver.manage().window().maximize();
			
			return driver;

		}
		
		
		
		return driver;

	}

}
