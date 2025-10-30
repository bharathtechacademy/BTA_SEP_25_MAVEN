package non.access.modifers;

public class StaticBlockExample {
	
	//Static Block is used to initialize the static data member.	
	static{
		System.out.println("This code will run always before the main method");
	}
	
	static String name = "Selenium";
	int age = 10;

	public static void main(String[] args) {
	//	System.out.println(StaticBlockExample.name);
		StaticBlockExample obj = new StaticBlockExample();
		System.out.println(obj.age);
	
	}

}
