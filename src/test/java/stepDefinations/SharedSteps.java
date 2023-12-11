package stepDefinations;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedSteps {
	
	public static WebDriver driver;
	
	@Before
	public static void getBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bookswagon.com/");
	}
	@After
	public static void teardown() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
