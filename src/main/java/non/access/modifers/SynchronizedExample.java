package non.access.modifers;

public class SynchronizedExample {

	// synchronized ==> Synchronized non-access modifier can be used before a
	// method.
	// When we are going to add the `synchronized` keyword before a method, only one
	// thread at a time is allowed.

	// One thread at a time. Any other class trying to access this synchronized
	// method is going to allow one class at a time or one program at a time to
	// access this method.
	// Parallel execution is not allowed.

	public synchronized void method(String test) throws InterruptedException {
		Thread.sleep(3000);// wait for 3 sec
		System.out.println("execution started for " + test);
		System.out.println("execution completed for " + test);
	}

	public void testCase1() throws InterruptedException {
		method("Test Case 1");
	}

	public void testCase2() throws InterruptedException {
		method("Test Case 2");
	}

}
