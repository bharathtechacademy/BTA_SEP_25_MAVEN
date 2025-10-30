package variables;

public class TypesOfVariablesInJava {
	
	// Types of Variables in Java based on Scope - 4 Categories
	
	
	/*
	
	1. Local Variables ==> 
	Local variables are the variables declared inside the method or block ({}).
	
	2. Instance Variables /Class Level Variables ==>
	Instance variables are the variables declared outside of the method but inside the class without using the static keyword.
	
	3. Static variables
	Static variables are the variables declared outside of the method but inside the class along with the static keyword.
	
	4. Parameter variables / arguments
	Parameter variables are the special local variables declared inside the method signature.
	
	*/
	
	
	public void method1(String name4) {
		String name1 = "Bharath"; // Local Variable, you cannot access outside of this method /block
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name4);// Parameter variable
	}
	
	String name2 = "Narayan"; // Instance variable. We can access this variable wherever we want by creating an instance of the class.
	
	static String name3 ="Kumar"; //Static variable. We can access this variable wherever we want without creating an object by just taking the reference of the class name.

	public static void main(String[] args) {
		TypesOfVariablesInJava obj = new TypesOfVariablesInJava();
//		System.out.println(obj.name1); //cannot access local variable
//		System.out.println(obj.name4);//cannot access parameter variable
		System.out.println(obj.name2);
		System.out.println(TypesOfVariablesInJava.name3);		
	}

	

}
