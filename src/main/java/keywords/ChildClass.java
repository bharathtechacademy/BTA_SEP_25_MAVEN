package keywords;

public class ChildClass extends ParentClass{
	
	String value = "Selenium";
	
	public void printValue(String value) {
		System.out.println(value);
//		System.out.println(new ChildClass().value);
//		System.out.println(new ParentClass().value);
		System.out.println(this.value);
		System.out.println(super.value);
	}
	

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.printValue("API");
	}

}
