package non.access.modifers;

public class StaticExample {
	
	// Static non-access modifier can be used before the data, before the method, before the block, and in our classes.
	
	// When we are going to add static non-access modifier, it won't be part of the class instance, so we don't need to create any object.
	
	static String name = "Selenium";
	
	public static void display() {
		System.out.println("This is a static method");
	}

	public static void main(String[] args) {
		StaticExample obj = new StaticExample();
		System.out.println(name);
		StaticExample.display();

	}

}
