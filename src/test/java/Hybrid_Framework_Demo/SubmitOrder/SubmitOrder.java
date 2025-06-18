package Hybrid_Framework_Demo.SubmitOrder;

import java.io.IOException;

import org.testng.annotations.Test;

import Hybrid_Framework_Demo.PageObjects.LandingPage;
import Hybrid_Framework_Demo.TestComponents.BaseTest;

public class SubmitOrder extends BaseTest{
	
	@Test
	public void Order() throws IOException, InterruptedException {
		
			launchApplication();
		     LandingPage l1 = new LandingPage(driver);
		    
		     
		     Thread.sleep(2000);
		     
		     l1.loginfields("pavanol", "test@123");
		     Thread.sleep(2000);
		     //Sucessfully test is completed
	}

}
