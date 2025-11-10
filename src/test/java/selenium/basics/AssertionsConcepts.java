package selenium.basics;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionsConcepts {
	
//	Assertion : to validate the application actual vs expected result
	
//	Assertions contain two different categories.
	
//	1. Hard Assertion (Assert): if any assertion is failed in between the program execution, it will stop the execution immediately.
//	2. Soft Assertion (SoftAssert): if any assertion is failed in between the program execution, it will continue the execution till end of the program.

	public static void main(String[] args) {
		
		//Hard Assertion
		Assert.assertEquals(10, 10, "Values are not matching");
		Assert.assertNotEquals("Hello", "Hello1", "Strings are matching");
		Assert.assertTrue(5>1, "Condition is false");
		Assert.assertFalse(3<1, "Condition is true");
		Assert.assertNotNull("Selenium", "Object is null");
		Assert.assertNull(null, "Object is not null");
		//Assert.fail("Failing the test case deliberately");		
		
		//Soft Assertion
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(10, 11, "Values are not matching");
		softAssert.assertNotEquals("Hello", "Hello", "Strings are matching");
		softAssert.assertTrue(5<1, "Condition is false");
		softAssert.assertFalse(3>1, "Condition is true");
		softAssert.assertNotNull(null, "Object is null");
		softAssert.assertNull("Selenium", "Object is not null");
		softAssert.fail("Failing the test case deliberately");		
		softAssert.assertAll(); // This will report all the soft assertion failures
		System.out.println("Execution completed successfully.");
		
		

	}

}
