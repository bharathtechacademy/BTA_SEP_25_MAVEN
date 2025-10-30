package operators;

public class Operators {
	
	//Operators ==> Operators are nothing but the special characters used to perform specific operations in Java programming.
	
	//Types of Operators
	
	//1. Arithmetic Operators  ==> +, -, *, /, % (modulus), ++ (increment==> +1), -- (decrement ==>-1) (Special characters used in mathematical operations.)
	//2. Assignment Operators ==> =, +=, -=, *=, /=, %= (Special characters used to assign values to variables.)
	//3. Comparison Operators ==> ==, !=, >, <, >=, <= (Special characters used to compare two values.)
	//4. Logical Operators ==> &&, ||, ! (Special characters used to combine multiple conditions.)
	//5. Ternary Operator ==> ? : (Special character used to evaluate a condition and return one of two values.)
	public static void main(String[] args) {
		
		//1. Arithmetic Operators  ==> +, -, *, /, %, ++, -- (Special characters used in mathematical operations.)
		System.out.println("***********Arithmetic Operators*************");
		int a = 10;
		int b = 5;
		System.out.println("Addition: " + (a + b)); // Addition
		System.out.println("Subtraction: " + (a - b)); // Subtraction
		System.out.println("Multiplication: " + (a * b)); // Multiplication
		System.out.println("Division: " + (a / b)); // Division
		System.out.println("Modulus: " + (a % b)); // Modulus
		
		// Increment ++ (Increase by 1)
		
		// a++ (post-increment) ==> First use the value of a, then increment it by 1
		System.out.println("Increment: " + (a++)); // Increment
		System.out.println("Value of a after post-executuin of statement: " + a); // Value of a after post-increment
		// ++b (pre-increment) ==> First increment the value of b by 1, then use it
		System.out.println("Increment: " + (++b)); // Increment
		
		//Decrement -- (Decrease by 1)
		
		// a-- (post-decrement) ==> First use the value of a, then decrement it by 1
		System.out.println("Decrement: " + (a--)); // Decrement
		System.out.println("Value of a after post-executuin of statement: " + a); // Value of a after post-decrement		
		// --b (pre-decrement) ==> First decrement the value of b by 1, then use it
		System.out.println("Decrement: " + (--b)); // Decrement
		
		
		//2. Assignment Operators ==> =, +=, -=, *=, /=, %= (Special characters used to assign values to variables.)
		System.out.println("***********Assignment Operators*************");
		int c = 10;		
		System.out.println("Initial value of c: " + c); // Initial value of c
		
		c += 5; // c = c + 5
		System.out.println("Value of c after c += 5: " + c); // Value of c after c += 5
		
		c -= 10; // c = c - 10
		System.out.println("Value of c after c -= 10: " + c); // Value of c after c -= 10
		
		c *= 2; // c = c * 2
		System.out.println("Value of c after c *= 2: " + c); // Value of c after c *= 2
		
		c /= 5; // c = c / 5
		System.out.println("Value of c after c /= 5: " + c); // Value of c after c /= 5
		
		c %= 3; // c = c % 3
		System.out.println("Value of c after c %= 3: " + c); // Value of c after c %= 3
		
		//3. Comparison Operators ==> ==, !=, >, <, >=, <= (Special characters used to compare two values.)
		System.out.println("***********Comparison Operators*************");
		int d = 10;
		int e = 20;
		
		System.out.println("d == e: " + (d == e)); // Equal to
		
		System.out.println("d != e: " + (d != e)); // Not equal to
		
		System.out.println("d > e: " + (d > e)); // Greater than
		
		System.out.println("d < e: " + (d < e)); // Less than
		
		System.out.println("d >= e: " + (d >= e)); // Greater than or equal to
		
		System.out.println("d <= e: " + (d <= e)); // Less than or equal to
		
		//4. Logical Operators ==> && (and), || (or), ! (not) (Special characters used to combine multiple conditions.)
		System.out.println("***********Logical Operators*************");
		
		int f = 10;
		int g = 20;
		int h = 30;
		
		// AND operator (&&) ==> true if both conditions are true
		System.out.println("f < g && g > h: " + (f < g && g > h)); // true && false = false
		
		// OR operator (||) ==> true if at least one condition is true
		System.out.println("f < g || g > h: " + (f < g || g > h)); // true || false = true
		
		// NOT operator (!) ==> true if the condition is false
		System.out.println("!(f < g): " + !(f < g)); // !true = false
		
		//5. Ternary Operator ==> ? : (Special character used to evaluate a condition and return one of two values.)
		
		//syntax ==> variable = (condition) ? value1 : value2;
		
		int i = 10;
		int j = 20;
		
		int maxValue ;
		
		if(i>j) {
			maxValue = i;
		}else {
			maxValue = j;
		}
		
		System.out.println("Max Value :"+maxValue);
		
		maxValue = (i>j) ? i : j;
		System.out.println("Max Value :"+maxValue);

	}

}
