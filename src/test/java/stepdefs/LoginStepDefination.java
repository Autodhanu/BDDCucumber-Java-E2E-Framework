package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDefination {

	private WebDriver driver;
	private LoginPage loginpage;
	
	@Before
	public void testsetUp()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");	
		driver=new ChromeDriver(options);
	}
	@After
	public void testtearDown()
	{
		if(driver!=null){
            driver.quit();
		}
	}
	
	@Given("I am on the SpiceJet login page")
	public void i_am_on_the_spice_jet_login_page() {
	    
		driver.get("https://spiceclub.spicejet.com/");
		loginpage = new LoginPage(driver);
	}

	@Given("I click on Login Button")
	public void i_click_on_login_button() {
		
		loginpage.enterLogin();
	}

	@And("I have entered valid {string} and {string}")
	public void i_have_entered_invalid_and(String username, String password) {
		loginpage.enterMobNum(username);
		loginpage.enterPassword(password);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() throws InterruptedException {
		loginpage.enterSubmit();
		Thread.sleep(4000);
	}
}
