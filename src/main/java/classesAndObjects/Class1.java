package classesAndObjects;

public class Class1 {

	int empId = 1234;//Heap Memory -> Instance Variable/Non Static Variable in Heap Memory
	static String empName = "Bharath"; // Static Variable / Class Variable in Meta Space/Method Area
	
	//Object : New Instance of a class is called Object. / New Copy of a class is called Object.
	
	//Synatx: new ClassName();
	
	
	//Heap
	//Stack
	//Method Area/Meta Space

	public static void main(String[] args) { //Method Area/Meta Space
		Class1 obj =  new Class1();	
		System.out.println(obj.empId);
		System.out.println(empName);
	}

}
