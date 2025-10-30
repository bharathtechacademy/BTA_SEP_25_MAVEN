package functional.interfaces;

import java.util.function.BiFunction;

public class TestClass {

	public static void main(String[] args) {
//		FunctionalInterface2 obj = new FunctionalInterface2();
//		int result = obj.sum(5, 10);
//		System.out.println("The sum is: " + result);
		
//		FunctionalInterface1 sum = (a, b) -> a + b; // Eliminated the implementation class
//		int result = sum.sum(5, 10);
//		System.out.println("The sum is: " + result);
		
		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b; // Using built-in functional interface, eliminated user created interface
		int result = sum.apply(5, 10);
		System.out.println("The sum is: " + result);
		
		FunctionalInterface3 op = a -> a * a;
		int squareResult = op.square(7);
		System.out.println("The square is: " + squareResult);

	}

}
