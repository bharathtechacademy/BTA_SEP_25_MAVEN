package normal.interfaces;

public class ChromeBrowser implements SeleniumWebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Chrome Browser Opened");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome Browser Closed");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome Browser Window Maximized");
	}

	@Override
	public void findElement() {
		System.out.println("Element found using Chrome Browser");
	}

}
