package oops;

public class PolyClass2 extends PolyClass1 {
	
	// Method Overriding - same method name and same parameters as in parent class
	public void add(int a, int b) {
		System.out.println("Addition of two integers: " + (a + b));
	}

	public static void main(String[] args) {
		PolyClass2 pc2 = new PolyClass2();
		pc2.add(10, 20); // Inherited method from PolyClass1

	}

}
