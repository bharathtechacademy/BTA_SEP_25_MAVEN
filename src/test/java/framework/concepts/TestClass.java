package framework.concepts;

public class TestClass {

	// 1. Verify login with valid and invalid credentials.
	// 2. Verify fund transfer
	// 3. Verify account balance
	
	//Challenges with basic framework
	
	// 1. We cannot run each and every test case independently.
	// 2. We cannot execute specific test cases.
	// 3. So we cannot group the test cases.
	// 4. Test case prioritization is also not possible.
	// 5. Calling the same methods again and again repeatedly for each and every test case.
	// 6. No test results reporting.
	// 7. Dependency test is not possible.

	public static void main(String[] args) {

		AppCommons app = new AppCommons();
		WebCommons web = new WebCommons();

		web.startReporting();

		// Test Case 1 - Verify login with valid credentials.
		System.out.println("********** Test Case 1 - Verify login with valid credentials. **********");
		web.launchBrowserAndApplication("Chrome", "www.icici.com");
		app.loginIntoApplication("Bharath", "Bharath@123");
		app.verifyApplicationHomePage();
		app.logoutFromApplication();
		web.closeBrowser();

		// Test Case 2 - Verify login with Invalid credentials.
		System.out.println("********** Test Case 2 - Verify login with Invalid credentials. **********");
		web.launchBrowserAndApplication("Chrome", "www.icici.com");
		app.loginIntoApplication("Invalid", "Invalid@123");
		app.verifyApplicationHomePage();
		app.logoutFromApplication();
		web.closeBrowser();

		// Test Case 3 - Verify fund transfer.
		System.out.println("********** Test Case 3 - Verify fund transfer. **********");
		web.launchBrowserAndApplication("Chrome", "www.icici.com");
		app.loginIntoApplication("Bharath", "Bharath@123");
		app.verifyApplicationHomePage();
		app.verifyFundTransfer();
		app.logoutFromApplication();
		web.closeBrowser();

		// Test Case 4 - Verify Account balance.
		System.out.println("********** Test Case 4 - Verify Account balance. **********");
		web.launchBrowserAndApplication("Chrome", "www.icici.com");
		app.loginIntoApplication("Bharath", "Bharath@123");
		app.verifyApplicationHomePage();
		app.verifyAccountBalance();
		app.logoutFromApplication();
		web.closeBrowser();

	}

}
