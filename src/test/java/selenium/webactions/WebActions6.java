package selenium.webactions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebActions6 {

	public static void main(String[] args) throws IOException {
		//1.Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//2.Maximize the browser window
		driver.manage().window().maximize();
		
		//3.Launch the application (https://jqueryui.com/slider/)
		driver.get("https://jqueryui.com/slider/");
		
		//4.Switch to the frame which contains the slider element
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//5.Locate the slider element
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
		
		//6. Locate the handle of the slider
		WebElement sliderHandle = slider.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		
		//7. The slider handle to the right by 200 pixels
		Actions action = new Actions(driver);
		action.dragAndDropBy(sliderHandle, 200, 0).perform();
		
		//8. The slider handle to the left by 100 pixels
		action.dragAndDropBy(sliderHandle, -100, 0).perform();
		action.dragAndDropBy(sliderHandle, -100, 0).perform();
		
		//9.Close the browser
		driver.quit();
	}
	

}
