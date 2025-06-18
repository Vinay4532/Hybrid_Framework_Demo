package Hybrid_Framework_Demo.AbstractComponents;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {
	
	public WebDriver driver;
	public AbstractComponents(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Genereic method for waits
	public void waitforElement(By FindBy)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(FindBy));
	}
	
	//Generic Mehtods for scorll up and down
	
	public void ScrollUp(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.ScrollBy(0,500)");
	}
	public void ScrollDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.ScrollBy(0,-500)");
	}
	//Generic methods for windows
	
	public void Windows(WebDriver driver)
	{
			Set<String> abc = driver.getWindowHandles();
					Iterator<String> it = abc.iterator();
					while(it.hasNext())
					{
						driver.switchTo().window(it.next());
					}
	}
	
	//Generic methods for frames
	
	public void Frames(WebDriver driver)
	{
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
	}

}
