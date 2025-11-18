package selenium.webactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebActions2 {

	public static void main(String[] args) {
//		1. Launch browser window(Chrome)      
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all the cookies       
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)        
		driver.get("https://demoqa.com/automation-practice-form");
		
//		5. Wait for Pageload
//		6. Enter Firstname and Lastname
//		7. Enter Email
//		8. Select Gender “Male”
//		9. Enter mobile number  “9553220022”
//		10.Select DOB (14-Feb-1991)
//		11.Search and Select “Computer Science”
//		12.Select Hobbies as “Sports and Reading”
//		13.Upload photo
//		14.Submit Details
//		15.Wait for successful submission message
//		16. Close browser window


	}

}
