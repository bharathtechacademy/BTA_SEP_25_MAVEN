package stringOperations;

public class TypeCasting {
	
	// Type casting is the process of converting one data type to similar data type.
	
	//1. Primitive typecasting ==> (Widening casting ,Narrowing casting)
	//2. Reference Typecasting ==> (Upcasting ,Downcasting)
	

	public static void main(String[] args) {
		
		//1. Primitive typecasting ==> (Widening casting)
		byte a = 10;
		int b = a;

		//1. Primitive typecasting ==> (Narrow casting)
		int c = 100;
		byte d = (byte) c;
	}

}
