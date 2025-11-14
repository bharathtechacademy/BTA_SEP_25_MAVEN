package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorConcepts {
	
	// RelativeLocator.with(targetWebElement).direction(referenceWebElement);
	
	//above, below, toLeftOf, toRightOf, near

	public static void main(String[] args) {

//		1. Launch the Browser window (Browser = Chrome)    
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window  
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)   
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Locate the services hyperlink by using RelativeLocator selector.
		driver.findElement(RelativeLocator.with(By.linkText("Services")).below(By.linkText("About Us")));
		driver.findElement(RelativeLocator.with(By.linkText("Services")).above(By.linkText("Products")));
		driver.findElement(RelativeLocator.with(By.linkText("Services")).near(By.className("logo")));



	}

}
