package language.basics;

public class ArrayExamples {

	public static void main(String[] args) {
		
		//Array : an array is a data structure that can hold multiple values with similar data types together in a same memory location by following contiguous memory allocation.
		
		
		//Array indexes start from 0 always. And maximum index can be length-1;
		
		
		//1D Array
		
		//Syntax : When we know the values
		String empNames[] = {"John", "Smith", "David", "Peter"};
		int empIds[] = {101, 102, 103, 104};
		
		System.out.println("Employee Name at index 2: " + empNames[2]);
		System.out.println("Employee ID at index 3: " + empIds[3]);
		
		
		//Syntax : When we don't know the values
		String countries [] = new String[5];
		countries[0] = "USA";
		countries[1] = "UK";
		countries[2] = "India";
		countries[3] = "Germany";
		countries[4] = "France";
	//	countries[5] = "Canada"; //ArrayIndexOutOfBoundsException
		
		
		//2D Array  ==> Arrays inside an array
		
		String empData[][] = {
				{"John", "Smith"},//project 1
				{"David", "Peter"},//project 2
				{"Linda", "Alice"}//project 3
		};
		
		//Print Linda
		System.out.println("Employee Name at project 3: " + empData[2][0]);
		
		//2d Array syntax when we don't know the values (2 projects and 3 employees in each project)
		//Project 1: John, Smith, David
		//Project 2: Peter, Linda, Alice
		
		String empData2[][] = new String[2][3];
		
		//Project 1
		empData2[0][0] = "John";
		empData2[0][1] = "Smith";
		empData2[0][2] = "David";
		
		//Project 2
		empData2[1][0] = "Peter";
		empData2[1][1] = "Linda";
		empData2[1][2] = "Alice";
		
		
		//3D Array -When we don't know the values
		//2 companies, 3 projects in each company, 4 employees in each project
		
		//Company 1 //0
		//Project 1: John, Smith, David, Peter
		//Project 2:(1) Linda, Alice(1), Bob, Charlie
		//Project 3: Tom, Jerry, Harry, Ron
		
		//Company 2
		//Project 1: Sam, Max, Leo, Jack
		//Project 2: Mia, Zoe, Ava, Eva
		//Project 3: Kim, Lee, Jay, Kay
		
		
		String empData3[][][] = new String[2][3][4];
		
		empData3[0][1][1]= "Alice";

	}

}
