package Hybrid_Framework_Demo.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Hybrid_Framework_Demo.PageObjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public LandingPage landingPage;
	
	public WebDriver intializedriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/Hybrid_Framework_Demo/Resources/GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");//prop.getProperty
		//prop.load(fis);
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			WebDriverManager.chromedriver().setup();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
		
	}
	//Take Screesnhot
	
	public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(System.getProperty("user.dir")+"/reports/"+testCaseName+".png");
		FileUtils.copyFile(src, dst);
		return 	System.getProperty("user.dir")+"/reports/"+testCaseName+".png";	
	}
	
	//beforemethod
	
	@BeforeMethod(alwaysRun =true)
	public LandingPage launchApplication() throws IOException
	{
			driver = intializedriver();
			landingPage = new LandingPage(driver);
			landingPage.goTo();
			return landingPage;
			
	}
	
	@AfterMethod(alwaysRun = false)
	public void tearDown()
	{
		driver.quit();
	}

}
