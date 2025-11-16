package selenium.webactions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebActions {
	
	//Buttons, Textbox, Dropdown, Checkbox, Radio-button, Hyperlink, Text/Labels, Scrollbar, Images, Calendar,  WebTables, Alerts, Frames

	public static void main(String[] args) throws IOException {
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Launch the application
		driver.get("https://example.com");
		
//		5. Locate the web element.
		WebElement element = driver.findElement(By.id("elementId"));
		
		/**********Common web element actions.**********/
		
//		Verify whether the element is displayed within the web page.
		boolean isDisplayed = element.isDisplayed();
		
//		Verify whether the element is enabled to perform action.
		boolean isEnabled = element.isEnabled();
		
//		Verify whether the checkbox is already selected.
		boolean isSelected = element.isSelected();
		
		/************Element-specific actions.**********/
		
		/*****************BUTTON*****************/
		
		//Locate the button element
		WebElement button = driver.findElement(By.id("buttonId"));
		
		//Verify the label of the button.
		String buttonLabel = button.getText(); //if it's a text button
		String buttonValue = button.getAttribute("value"); //if label is in 'value' attribute
		
		//Click the button
		button.click();
		
		//Double-click on the button.
		Actions actions = new Actions(driver); //mouse and keyboard actions
		actions.doubleClick(button).perform();
		
		//Right-click (context click) on the button.
		actions.contextClick(button).perform();
		
		//move the mouse cursor to the button.
		actions.moveToElement(button).perform();
		
		//drag and drop operation on the button.
		WebElement target = driver.findElement(By.id("targetId"));
		actions.dragAndDrop(button, target).perform();
		
		//Click on the hidden button.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", button);//scroll to the button
		button.click();
		
		//Click on the hidden button using direct JavaScript click method.
		js.executeScript("arguments[0].click();", button);
		
		//Type the text in the disabled text box by using JavaScript executor.
		WebElement textBoxElement = driver.findElement(By.id("textBoxId"));
		js.executeScript("arguments[0].value='Sample Text';", textBoxElement);
		
		/*****************TEXTBOX*****************/
		WebElement textBox = driver.findElement(By.id("textBoxId"));
		
		//Clear the text box.
		textBox.clear();
		
		//Enter the text into the text box.
		textBox.sendKeys("Sample Text");
		
		//Verify the placeholder text within the text box.
		String placeholderText = textBox.getAttribute("placeholder");
		
		//Type the text into the text box by using Actions class along with function keys.
		actions.sendKeys(textBox, "Sample Text").sendKeys(Keys.ENTER).perform();
		
		/*****************DROPDOWN*****************/
		WebElement dropdown = driver.findElement(By.id("dropdownId"));
		
		//Verify whether the dropdown is a single selection or multi-selection dropdown.
		Select select = new Select(dropdown);
		boolean isMultiple = select.isMultiple();
		
		//Verify the selected option within the drop-down.
		String selectedOption = select.getFirstSelectedOption().getText();
		
		//Select the option from the drop-down.
		select.selectByVisibleText("Option 1");
		select.selectByValue("option1");
		select.selectByIndex(1);
		
		//Deselect the option from the multi-selection drop-down.(only for multi-select)
		if(isMultiple) {
			select.deselectByVisibleText("Option 1");
			select.deselectByValue("option1");
			select.deselectByIndex(1);
			select.deselectAll();
		}
		
		//Get all the options available in the drop-down and count them.
		List<WebElement> allOptions = select.getOptions();
		int optionsCount = allOptions.size();//count of options
		for(WebElement option : allOptions) {
			String optionText = option.getText();//option text
		}
		
		
		/*****************CHECKBOX*****************/
		WebElement checkbox = driver.findElement(By.id("checkboxId"));
		
		//Select the checkbox if not already selected.
		boolean isCheckboxSelected = checkbox.isSelected();
		if(!isCheckboxSelected) {
			checkbox.click();
		}
		
		/*****************RADIOBUTTON*****************/
		WebElement radioButton = driver.findElement(By.id("radioButtonId"));
		
		//Select the radio button
		radioButton.click();
		
		/*****************IMAGE*****************/
		WebElement image = driver.findElement(By.id("imageId"));
		
		//Verify whether the image is displayed.		
		boolean isImageDisplayed = image.isDisplayed();
		
		//Verify whether the correct image is displayed or not.
		String imageSrc = image.getAttribute("src");
		
		//Verify the size or resolution of the image.		
		int imageWidth = image.getSize().getWidth();
		int imageHeight = image.getSize().getHeight();
		
		//Verify the position of the image.
		int imageX = image.getLocation().getX();
		int imageY = image.getLocation().getY();		
		
		//Verify the color of a specific pixel within the image.
		int colorOfPixel = ImageIO.read(new File(imageSrc)).getRGB(imageX, imageY); //example pixel at (10,10)
		
		/*****************HYPERLINK*****************/
		WebElement hyperlink = driver.findElement(By.id("hyperlinkId"));
		
		//Verify the URL of the hyperlink.
		String hyperlinkURL = hyperlink.getAttribute("href"); //method 1
		
		hyperlink.click(); //method 2 to verify by navigation
		String currentURL = driver.getCurrentUrl();
		
		/*****************TEXT*****************/		
		WebElement textElement = driver.findElement(By.id("textId"));
		
		String text1 = textElement.getText(); //if it's a normal text 
		String text2 = textElement.getAttribute("value"); //if label is in 'value' attribute
		
		/*****************CALENDAR*****************/
		/*****************WEBTABLE*****************/
		
		/*****************ALERTS*****************/
		Alert alert = driver.switchTo().alert(); //copy the alert box
		
		//Get the text message displayed on the alert box.
		String alertMessage = alert.getText();
		
		//Accept the alert box.(click OK)
		alert.accept();
		
		//Dismiss the alert box.(click Cancel)
		alert.dismiss();
		
		//Enter the text in the alert box.(for prompt alert)
		alert.sendKeys("Sample Input");
		
		/*****************FRAMES*****************/
		
		//Switch to the frame using id or name or web element.
		driver.switchTo().frame("frameId");
		driver.switchTo().frame(driver.findElement(By.id("frameId")));
		
		//switch back to the main web page from the frame.
		driver.switchTo().defaultContent();
		
		/*************UPLOAD FILE*****************/
		WebElement uploadElement = driver.findElement(By.id("uploadId"));
		uploadElement.sendKeys("C:\\path\\to\\file.txt");
		
		
		
	}

}
