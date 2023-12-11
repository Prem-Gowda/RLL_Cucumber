//package pagefactory;
//
//import java.net.MalformedURLException;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//
//public class BasePage {
//	public static WebDriver driver=null;
//	
//	public static void getBrowser() throws MalformedURLException, InterruptedException{
//		driver=new ChromeDriver();
//        driver.manage().window().maximize();
//		driver.get("https://www.bookswagon.com/");
//		Thread.sleep(3000);
//		String ExpectedTitle="Online Bookstore | Buy Books Online | Read Books Online";
//		String title=driver.getTitle();
//		Assert.assertEquals(title, ExpectedTitle);
//		System.out.println("Title of the Homepage is: "+title);
//		}
//	
//}
