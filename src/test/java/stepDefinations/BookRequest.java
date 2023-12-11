package stepDefinations;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pagefactory.RequestBookPage;

public class BookRequest  {
	WebDriver driver;
	
	RequestBookPage rb;
	
	
	@Given("User should be in request page")
	public void user_should_be_in_request_page() throws InterruptedException{
		
			driver=new EdgeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.bookswagon.com/");
			rb=PageFactory.initElements(driver, RequestBookPage.class);
			Thread.sleep(1000);
//		bp.getBrowser("https://www.bookswagon.com/");
		Thread.sleep(1000);
			rb.navigateToRequestBookPage();
			
	}
	@When("enter the required data")
	public void enter_the_required_data() throws InterruptedException {
		rb.requestBook("9789353338459d", "Power Of Your Subconscious Mind", "Joseph Murphy", "3", "vijayvel10301@gmail.com", "9980924169");
		
	}
	
	@When("Click the submit button")
	public void click_the_verify_and_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		rb.clickSubmitButton();
		
	    
	}
	@Then("request should be notify to them")
	public void request_should_be_notify_to_them() {
	    // Write code here that turns the phrase above into concrete actions
		rb.notifyMessage();
		driver.quit();
	    
	}
	}
	
	


