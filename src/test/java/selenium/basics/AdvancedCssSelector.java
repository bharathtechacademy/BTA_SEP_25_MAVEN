package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedCssSelector {
	
	//CssSelector - Basic Syntaxes
	
	//Syntax 1: tagName#id
	//Syntax 2: tagName.className
	//Syntax 3: tagName[attribute='value']
	
	//CssSelector - Advanced Syntaxes	
	//Syntax 4: ancestor > parent > child
	
	//ancestor: ul[class='leftmenu']
	//parent: li
	//child: a[href='services.htm']
	
	// ul[class='leftmenu'] > li > a[href='services.htm']

	public static void main(String[] args) {
//		1. Launch the Browser window (Browser = Chrome)    
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window  
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)   
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Locate the services hyperlink by using CSS selector.
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > a[href='services.htm']"));

	}

}
