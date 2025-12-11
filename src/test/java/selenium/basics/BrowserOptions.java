package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {

	public static void main(String[] args) {
		
//		0. Add Browser configurations
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("--allow-notifications");
		options.addArguments("--headless");
		options.addArguments("--ignore-certificate-errors");

//		1. Launch the Browser window (Browser = Chrome)    
		WebDriver driver = new ChromeDriver(options);
		
//		2. Minimize browser window    
		driver.manage().window().minimize();
		
//		3. Maximize the browser window  
		driver.manage().window().maximize();
		
//		4. Enter URL and Launch the Application (https://www.google.co.in/)   
		driver.get("https://www.google.co.in/");
		

	}

}
