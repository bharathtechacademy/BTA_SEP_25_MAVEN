package methods;

public class AfterMethods {
	
	
	void launchBrowserAndApplication(String browser){
		System.out.println("Launch the "+browser+" browser");
		System.out.println("Enter url 'www.icici.com' and launch application");
	}
	
	void login(){
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
	}

	void logoutAndCloseBrowser(){
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}

	static double getAccountBalance(){
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50; //local variable
		return balance;
	}

	public static void main(String[] args) {

		AfterMethods obj = new AfterMethods();

		// Test Case 1: Validating the Home Page
		System.out.println("==============Test Case 1: Validating the Home Page==================");
		obj.launchBrowserAndApplication("chrome");
		obj.login();
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
		obj.logoutAndCloseBrowser();

		// Test Case 2: Validating the Fund Transfer Page
		System.out.println("==============Test Case 2: Validating the Fund Transfer Page==================");
		obj.launchBrowserAndApplication("edge");
		obj.login();
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		obj.logoutAndCloseBrowser();

		// Test Case 3: Validating the Login Page with Valid Credentials
		System.out.println(
				"==============Test Case 3: Validating the Login Page with Valid Credentials==================");
		obj.launchBrowserAndApplication("chrome");
		obj.login();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseBrowser();

		// Test Case 3: Validating the Login Page with Invalid Credentials
		System.out.println(
				"==============Test Case 3: Validating the Login Page with Invalid Credentials==================");
		obj.launchBrowserAndApplication("chrome");
		System.out.println("Enter username as Invalid");
		System.out.println("Enter password as invalid123");
		System.out.println("Click on Login button");
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseBrowser();

		// Test Case 4: Validating the Account Balance Page and get the balance
		System.out.println(
				"==============Test Case 4: Validating the Account Balance Page and get the balance==================");
		obj.launchBrowserAndApplication("firefox");
		obj.login();
		System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
		System.out.println(AfterMethods.getAccountBalance());
		obj.logoutAndCloseBrowser();
	}

}
