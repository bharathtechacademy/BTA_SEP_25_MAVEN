package loopStatements;

public class JumpingStatements {
	
	//Jumping statements are set of keywords that we are going to use during the execution process to jump from the current iteration to the next iteration, 
	// or to come out of iterations basically.
	
	// There are three types of jumping statements in Java:
	
	// break statement: It is used to exit from a loop or switch statement before its normal termination.
	// continue statement: It is used to skip the current iteration of a loop and move to the next iteration.
	
	// return statement: It is used to exit from a method and optionally return a value to the caller.

	public static void main(String[] args) {
		
		
		for(int i=1; i<=10; i++) {
			
			if(i==5) {
				//break;
				continue;
			}
			
			System.out.println(i);
		}
		

	}

}
