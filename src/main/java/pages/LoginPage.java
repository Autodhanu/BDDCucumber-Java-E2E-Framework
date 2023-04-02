package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage {

	private WebDriver driver;
	
	private By loginBtn=By.xpath("//span[contains(.,'Login')]");
	
	private By UserName=By.xpath("//input[@class=' form-control']");
	
	private By password=By.xpath("//input[@id='password']");
	
	private By submit=By.xpath("(//div[contains(.,'Log In')])[8]");
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	  // Methods
	@Test
	public void enterLogin() {
	        WebElement emailInput = driver.findElement(loginBtn);
	        emailInput.click();
	    }
	@Test  
    public void enterMobNum(String MobUum) {
        WebElement emailInput = driver.findElement(UserName);
        emailInput.sendKeys(MobUum);
    }
	@Test
    public void enterPassword(String Passwd)
    {
    	WebElement passwordInput=driver.findElement(password);
    	
    	passwordInput.sendKeys(Passwd);
    }
	@Test
    public void enterSubmit()
    {
    	WebElement submitClick=driver.findElement(submit);
    	
    	submitClick.click();
    }
}
