package functional.interfaces;

@FunctionalInterface
public interface FunctionalInterfaceExample {
	
	// A functional interface is an interface that contains exactly one abstract method.
	// Functional interface is an interface that is going to focus on one single functionality.
	// Functional Interface is also called as SAM Interface (Single Abstract Method Interface).	
		
	//single abstract method
	public void method();
	
	
	// It can have any number of default methods or static methods.
	public default void defaultMethod1() {
		System.out.println("This is a default method in FunctionalInterfaceExample");
	}
	
	public static void staticMethod1() {
		System.out.println("This is a static method in FunctionalInterfaceExample");
	}
	
	public default void defaultMethod2() {
		System.out.println("This is a default method in FunctionalInterfaceExample");
	}
	
	public static void staticMethod2() {
		System.out.println("This is a static method in FunctionalInterfaceExample");
	}


}
