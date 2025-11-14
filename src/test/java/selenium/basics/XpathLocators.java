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
	
	/*****************LEVEL 2 - Using Partial Attribute /text values using contains & starts-with *****************/
	//Syntax 3: //tagname[contains(@attribute,'partial-attribute-value')]
	//Syntax 4: //tagname[contains(text(),'partial-text-value')]
	
	//Syntax 5: //tagname[starts-with(@attribute,'partial-attribute-value')]
	//Syntax 6: //tagname[starts-with(text(),'partial-text-value')]
	
	/*****************LEVEL 3 - Combine multiple attributes and attribute values including text values by using the 'AND' operator. *****************/
	
	//Syntax 7: //tagname[@attribute1='attribute-value1' and @attribute2='attribute-value2' and text()='text-value']
	
	/*****************LEVEL 4 - Advanced Xpath with relationship *****************/
	//referenceElementXpath/relation::targetElementXpath
	
	//child (/)
	//parent
	//ancestor
	//following-sibling
	//preceding-sibling
	//following
	//preceding
	//with-in-the family (//)
	
	//target > target-sibling > parent > ancestor > ancestor parent
	
	
	//ancestor: //ul[@class='leftmenu']
	//parent: //li
	//target : //a[text()='Services']
	
	
	//ul[@class='leftmenu']/li/a[text()='Services']
	//ul[@class='leftmenu']/child::li/child::a[text()='Services']
	//ul[@class='leftmenu']//a[text()='Services']
	
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
		
//		7. Locate the logo by using Xpath Locator Syntax 3.
		driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
		
//		8. Locate the caption by using Xpath Locator Syntax 4.
		driver.findElement(By.xpath("//p[contains(text(),'difference')]"));
		
//		9. Locate the logo by using Xpath Locator Syntax 5.
		driver.findElement(By.xpath("//img[starts-with(@src,'images/logo')]"));
		
//		10. Locate the caption by using Xpath Locator Syntax 6.
		driver.findElement(By.xpath("//p[starts-with(text(),'Experience')]"));
		
//		11. Locate the logo by using Xpath Locator Syntax 7.
		driver.findElement(By.xpath("//img[@class='logo' and @title='ParaBank' and @alt='ParaBank']"));
		
//		12. Locate the caption by using Xpath Locator Syntax 7.
		driver.findElement(By.xpath("//p[@class='caption' and text()='Experience the difference']"));
		
//		13. Locate the services element by using Xpath Locator Syntax 8.
		driver.findElement(By.xpath("//ul[@class='leftmenu']/li/a[text()='Services']"));
		driver.findElement(getLink("Services"));

	}
	
	//dynamic xpath 
	public static By getLink(String linkText) {
		return By.xpath("//ul[@class='leftmenu']/li/a[text()='"+linkText+"']");
	}

}
