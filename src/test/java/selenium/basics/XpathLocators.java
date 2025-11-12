package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	
	//XPath ==> XML Path of an element in a webpage
	
	//There are two types of XPath available:
	
	//1. Absolute XPath
		//It defines the path of an element from the root element.
		//It starts with a single forward slash (/)
		//Example: /html/body/div[2]/div[1]/div[1]/h1
	
	//2. Relative XPath
		//It defines the path of an element from the current node or any other node.
		//It starts with a double forward slash (//)
		//Example: //h1[@class='header']
	
	//Syntax of Relative XPath:
	
	/*****************LEVEL 1 - BASIC SYNTAXES *****************/
	//Syntax 1: //tagname[@attribute='attribute-value']
	//Syntax 2: //tagname[text()='text-value']

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)    
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window  
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)   
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Locate the logo by using Xpath Locator Syntax 1.
		driver.findElement(By.xpath("//img[@class='logo']"));
		
//		6. Locate the caption by using Xpath Locator Syntax 2.
		driver.findElement(By.xpath("//p[text()='Experience the difference']"));

	}

}
