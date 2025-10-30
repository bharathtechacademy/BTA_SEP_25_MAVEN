package non.access.modifers;

public final class FinalExamples {
	
	//Final non-access modifier can be used before the variable, before method, even before classes as well.
	
	// final means "unchangeable" or "constant" or "no more changes allowed"
	
	//final variable: A final variable is a constant. Once it is assigned a value, it cannot be changed.
	//final method: A final method cannot be overridden by subclasses.
	//final class: A final class cannot be subclassed / can't be inherited.
	
	int a = 10; //non-final variable
	final int b = 20; //final variable
	
	final double pi = 3.14; 
	
	public void display() {
		System.out.println("Calling display method from FinalExamples class");
	}

	public static void main(String[] args) {
		
		FinalExamples obj = new FinalExamples();
		obj.a = 30; //allowed
		System.out.println("Non-final variable a: " + obj.a);
		
		//obj.b = 40; //not allowed, compile time error
		System.out.println("Final variable b: " + obj.b);
		

	}

}
