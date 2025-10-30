package normal.interfaces;

public class TestClass {

	public static void main(String[] args) {
		SeleniumWebDriver driver = new ChromeBrowser();
		driver.openBrowser();
		driver.maximizeWindow();
		driver.findElement();
		driver.closeBrowser();

	}

}
