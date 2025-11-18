package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebActions1 {
	static WebDriver driver;

	public static void main(String[] args) {
//		1. Launch the Chrome browser window
		driver = new ChromeDriver();
		
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
		Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
		
//		7. Verify application caption " Experience the difference"
		String expectedCaption = "Experience the difference";
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		String actualCaption = caption.getText();
		Assert.assertEquals(actualCaption, expectedCaption, "Caption verification failed");
		
//		8. Enter Invalid credentials in Username (Invalid User) and Password (“ “-empty) textboxes
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		username.sendKeys("Invalid User");
		password.sendKeys("");
		
//		9. Click on Login Button
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		loginButton.click();
		
//		10. Verify error message is displayed (Please enter a username and password.)
		//Thread.sleep(5000); // Adding a sleep to wait for the error message to appear
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));
		
		WebElement errorMessage = driver.findElement(By.xpath("//p[@class='error']"));
		String expectedErrorMessage = "Please enter a username and password.";
		String actualErrorMessage = errorMessage.getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message verification failed");
		
//		11. Click on Admin page link		
		WebElement adminPageLink = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminPageLink.click();
		
//		12. Wait for admin page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[contains(text(),'Administration')]"), 0));
		
//		13. Select Data access mode as ' SOAP'		
		selectDataAccessMode("soap");
		
//		14. Scroll-down till Loan provider
		WebElement loanProvider = driver.findElement(By.xpath("//select[@name='loanProvider']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", loanProvider);
				
//		15. Select Loan provider as 'Web Service'
		Select loanSelect = new Select(loanProvider);
		loanSelect.selectByVisibleText("Web Service");
		
//		16. Click on Submit button		
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitButton.click();
		
//		17.wait for Successful submission message
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text()='Settings saved successfully.']"), 0));
				
//		18.Click on Services Link
//		19.Wait for Services page
//		20.Scroll-down till Bookstore services
//		21.Get total rows, columns in the bookstore service table
//		22.Get Column headers of book store services table
//		23.Get all the data from book store service table
//		24.Close browser window
	}
	
	public static void selectDataAccessMode(String mode) {
		WebElement dataAccessMode = driver.findElement(By.xpath("//input[@value='"+mode+"']"));
		dataAccessMode.click();
	}

}
