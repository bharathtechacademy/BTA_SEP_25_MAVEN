package loopStatements;

public class LoopStatements {
	
	//Loop Statements ==> Loop the statements basically.
	
	//for loop ==> for loop is used when we know the total number of iterations to be executed before itself.
	
	//Syntax for for loop:
	//	for(condition1; condition2; condition3) { //condition1==> where to start, condition2==> where to end, condition3==> interval to increment/decrement
	//		code to be executed
	//	}
	
	//while loop ==> A while loop will be used when we don't know the total number of iterations to be executed before the execution process.

	public static void main(String[] args) {
		
		String name = "Kumar";		
		
		//Before Loops in Java (If i want to print 10 times)
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
		
		//After Loops in Java (If i want to print 10 times)
		for(int i=1 ;i<=10 ;i++) { //++ ==> +1
			System.out.println(i+name);
		}


	}

}
