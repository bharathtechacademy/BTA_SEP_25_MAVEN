package stringOperations;

public class TypeCast2 extends TypeCast1{

	public static void main(String[] args) {
		TypeCast1 obj1 = new TypeCast2(); //Upcasting (parent info + child info)
		TypeCast2 obj2 =(TypeCast2) obj1; //downcasting
	}

}
