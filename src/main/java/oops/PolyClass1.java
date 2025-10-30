package oops;

public class PolyClass1 {

	public void add(int a, int b) {
		System.out.println("Sum of two integers: " + (a + b));
	}
	

	// Method Overloading - same method name with different parameters
	public void add(int a, int b, int c) {
		System.out.println("Sum of three integers: " + (a + b + c));
	}

	public static void main(String[] args) {
		PolyClass1 pc = new PolyClass1();
		pc.add(10, 20, 30);
	}

}
