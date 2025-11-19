package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions3 {

	public static void main(String[] args) {
//		1.Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
//		2.Maximize the browser window
		driver.manage().window().maximize();
		
//		3.Launch the application ( https://demoqa.com/alerts )		
		driver.get("https://demoqa.com/alerts");
		
//		4.Locate Alert buttons
		WebElement infoAlertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		WebElement confirmAlertButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		WebElement promptAlertButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		
//		5.Launch Information alert		
		infoAlertButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert infoAlert = driver.switchTo().alert();
		
//		6.Print Alert message
		System.out.println("Information Alert Message: " + infoAlert.getText());
		
//		7.Click on OK button
		infoAlert.accept();
		
//		8.Launch confirmation alert
		
		confirmAlertButton.click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert confirmAlert = driver.switchTo().alert();		
		
//		9.Print Alert message		
		System.out.println("Confirmation Alert Message: " + confirmAlert.getText());
		
//		10.Click on Cancel button
		confirmAlert.dismiss();
		
//		11.Launch prompt alert with dialog box alert
		promptAlertButton.click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert promptAlert = driver.switchTo().alert();
		
//		12.Print message
		System.out.println("Prompt Alert Message: " + promptAlert.getText());
		
//		13.Enter Text in Alert
		promptAlert.sendKeys("Selenium Automation");
		
//		14.Click on OK button
		promptAlert.accept();
		
//		15.Close browser window
		driver.quit();
	}

}
