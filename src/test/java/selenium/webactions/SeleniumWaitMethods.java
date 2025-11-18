package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumWaitMethods {
	
	//In Selenium, there are three different types of weight methods available.
	
	//1. Implicit Wait  ==>  Applies to all the web elements in the script
	//2. Explicit Wait ==>  Applies to a specific web element
	//3. Fluent Wait ==>  Similar to Explicit wait but with polling frequency and ignoring specific exceptions

	public static void main(String[] args) {
//		1. Launch the Chrome browser window
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL "https://parabank.parasoft.com/parabank" and Launch the application
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Verify application title (ParaBank | Welcome | Online Banking)
		String expectedTitle = "ParaBank | Welcome | Online Banking";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title verification failed");
		
//		6. Verify application logo 
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		
		// Using Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Using Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@class='logo']"))));
		wait.until(ExpectedConditions.invisibilityOf(logo));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//img[@class='logo']"), 0));
		wait.until(ExpectedConditions.alertIsPresent());
		
		// Using Fluent Wait
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5));
		fluentWait.until(ExpectedConditions.visibilityOf(logo));
	}

}
