package methods;

public class Constructor1 {

	String name = "John";
	int age = 25;

	// Constructor Method
	
	//default constructor
	Constructor1() {

	}		

	
	//Before Parameterized Constructor
//	void printEmployeeName(int empid, String empname) {
//		System.out.println("Employee ID: " + empid);
//		System.out.println("Employee Name: " + empname);
//	}
//	
//	void printEmployeeAddress(int empid, String empaddress) {
//		System.out.println("Employee ID: " + empid);
//		System.out.println("Employee Address: " + empaddress);
//	}
//	
//	void printEmployeeSalary(int empid, double empsalary) {
//		System.out.println("Employee ID: " + empid);
//		System.out.println("Employee Salary: " + empsalary);
//	}
	
	
	// parameterized constructor
	Constructor1(int id) {
		empid = id;
	}
	
	// parameterized constructor
	Constructor1(int id, String email) {
			empid = id;
			emailId = email;
	}
	
	int empid;
	String emailId;
	
	// After Parameterized Constructor
	void printEmployeeName(String empname) {
		System.out.println("Employee ID: " + empid);
		System.out.println("Employee Name: " + empname);
	}
	
	void printEmployeeAddress(String empaddress) {
		System.out.println("Employee ID: " + empid);
		System.out.println("Employee Address: " + empaddress);
	}
	
	void printEmployeeSalary(double empsalary) {
		System.out.println("Employee ID: " + empid);
		System.out.println("Employee Salary: " + empsalary);
	}
	
	
	

}
