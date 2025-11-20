package selenium.webactions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebActions7 {

	public static void main(String[] args) throws IOException {
		//1.Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//2.Maximize the browser window
		driver.manage().window().maximize();
		
		//3.Launch the application (https://books-pwakit.appspot.com/)
		driver.get("https://books-pwakit.appspot.com/");
		
		//4. Locate the shadow host element.
		WebElement shadowHost = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']"));
		
		//5. Look at the shadow root element
		SearchContext shadowRoot = shadowHost.getShadowRoot(); // Selenium 4 feature to access shadow DOM
		
		//6. Locate the shadow element inside the shadow root
		WebElement appHeader = shadowRoot.findElement(By.cssSelector("app-header"));
		
		//7. Locate the search books element available within the appHeader element.
		WebElement searchBooks = appHeader.findElement(By.cssSelector("input#input"));
		searchBooks.sendKeys("Selenium");
		
		//9.Close the browser
		driver.quit();
	}
	

}
