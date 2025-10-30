package methods;

public class Constructor2 {

	public static void main(String[] args) {
		
		Constructor1 obj = new Constructor1();//Object created (new keyword + Constructor Method)
		
		System.out.println("Name: " + obj.name);
		System.out.println("Age: " + obj.age);
		
		//Method calling	
		Constructor1 obj1 = new Constructor1(1234);
		obj1.printEmployeeName("Pavan Kumar");
		obj1.printEmployeeAddress("Hyderabad");
		obj1.printEmployeeSalary(45000.00);

	}

}
