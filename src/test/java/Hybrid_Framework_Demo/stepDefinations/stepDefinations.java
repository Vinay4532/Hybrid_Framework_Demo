package Hybrid_Framework_Demo.stepDefinations;

import java.io.IOException;

import Hybrid_Framework_Demo.PageObjects.LandingPage;
import Hybrid_Framework_Demo.TestComponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinations extends BaseTest{
	
	public LandingPage landingPage;
	
	@Given("I Landed on Ecommerce Page")
	public void I_Landed_on_Ecommerce_Page() throws IOException
	{
			landingPage = launchApplication();
	}
	
	@When("wait for 5 seconds")
	public void wait_for_5_seconds() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	@Then("^Logged in with username (.+) and password (.+)$")
	public void logged_in_with_username_and_password(String username,String password) throws InterruptedException
	{
		 LandingPage page=new LandingPage(driver);
		 page.loginfields(username, password);
		 driver.close();
	}

}
