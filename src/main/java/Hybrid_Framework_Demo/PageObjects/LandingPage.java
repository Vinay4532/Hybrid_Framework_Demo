package Hybrid_Framework_Demo.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Hybrid_Framework_Demo.AbstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='login2']")
	WebElement loginbutton;
	
	@FindBy(xpath="//input[@id='loginusername']")
	WebElement usernameinputfield;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	WebElement passwordfield;
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement loginclick;
	
	public void goTo() {
		
		driver.get("https://www.demoblaze.com/");
		
	}
	public void loginfields(String username,String password) throws InterruptedException
	{
		loginbutton.click();
		Thread.sleep(3000);
		usernameinputfield.sendKeys(username);
		Thread.sleep(3000);
		passwordfield.sendKeys(password);
		loginclick.click();
		Thread.sleep(3000);
	}

}
