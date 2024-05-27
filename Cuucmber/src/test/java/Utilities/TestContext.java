package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestContext {
	
	
	public WebDriver driver;
	public ObjectManager manager;
	public BaseClass base;
	
	public TestContext() {
	   base=new BaseClass();
		this.driver=base.setup();
		manager=new ObjectManager(this.driver);
		
		
		
	}
	
	
	
	
	
	

}
