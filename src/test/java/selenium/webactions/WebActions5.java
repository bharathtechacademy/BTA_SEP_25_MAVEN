package selenium.webactions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebActions5 {

	public static void main(String[] args) throws IOException {
		//1.Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//2.Maximize the browser window
		driver.manage().window().maximize();
		
		//3.Launch the application (https://demoqa.com/frames)
		driver.get("https://demoqa.com/frames");
		
		//Locate the Logo element
		WebElement logoElement = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
		
		//take screenshot of logo element
		getElementScreenshot(logoElement, "Logo");
		
		//4.Locate elements 'Frames' header in main window and 'This is a sample page' inside the frame
		WebElement mainWindowHeader = driver.findElement(By.xpath("//h1[@class='text-center']"));
		
		//switch to frame from main window		
		driver.switchTo().frame("frame1");
		
		//locate frame element
		WebElement frameElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		
		//5.Print frame element text
		System.out.println("Frame Element Text: " + frameElement.getText());
		
		//switch back to main window from frame
		driver.switchTo().defaultContent();
		
		//6.Print main window element text
		System.out.println("Main Window Header Text: " + mainWindowHeader.getText());
		
		//take screenshot of main window
		getWindowScreenshot(driver, "MainWindow");
		
		//7.Close browser window
		driver.quit();
	}
	
	// Method to capture screenshot of browser window
	public static String getWindowScreenshot(WebDriver driver, String fileName) throws IOException {
		String destination = System.getProperty("user.dir") + "\\Screenshots\\" + fileName + ".png";
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(destination));
		return destination;
	}

	// Method to capture screenshot of browser window
	public static String getElementScreenshot(WebElement element, String fileName) throws IOException {
		String destination = System.getProperty("user.dir") + "\\Screenshots\\" + fileName + ".png";
		File screenshotFile = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(destination));
		return destination;
	}

}
