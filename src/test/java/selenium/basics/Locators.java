package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	//WebElement ==> The element displayed within the application user interface.
	//Locator ==> The strategy or Selenium method that we are going to use to identify the location of a web element.
	
	//There are nine types of locator strategies available in Selenium.
	
	//1. ID Locator ==> ID attribute value of web element.
	//2. Name Locator ==> Name attribute value of web element.
	//3. Class Name Locator ==> Class attribute value of web element.
	//4. Tag Name Locator ==> HtmlTag of web element.
	//5. LinkText Locator ==> Text value of hyperlink web element.
	//6. Partial Link Text Locator ==> Partial text value of hyperlink web element.
	
	//7. CSS Selector Locator
	//8. XPath Locator
	//9. Relative Locator  (New in Selenium 4)

	public static void main(String[] args) {
	
//		1. Launch the Browser window (Browser = Chrome)    
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window  
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://www.google.co.in/)   
		driver.get("https://www.google.co.in/");
		
//		5. Locate Google search text box with ID locator.	
		driver.findElement(By.id("APjFqb"));
		
//		6. Locate Google search text box with Name locator.	
		driver.findElement(By.name("q"));
		
//		7. Locate Google search text box with ClassName locator.
		driver.findElement(By.className("gLFyf"));
		
//		8. Locate Google search text box with TagName locator.			
		driver.findElement(By.tagName("textarea"));
		
//		9. Locate 'How Search Works' Hyperlink with LinkTextlocator.		
		driver.findElement(By.linkText(" How Search works "));
		
//		10. Locate 'How Search Works' Hyperlink with PartialLinkText locator.
		WebElement link = driver.findElement(By.partialLinkText("How Search"));
		
		

	}

}
