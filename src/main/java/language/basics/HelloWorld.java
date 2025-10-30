package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class HelloWorld {	
	
	
	/*******Benefits of print statements
	 * @throws FileNotFoundException *******/
	
	/*
	 * 1. Debugging and error detection while executing your program.
	 * 
	 * 2. Print statements are going to help you monitor the program's execution process.
	 * 
	 * 3. Education and learning purpose. We are going to use the Sprint statements.
	 * 
	 * 4. Print statements are going to help us in terms of testing and validating the new features.
	 * 
	 * 5. Print statements are going to help us in terms of logging the system prototypes and execution statements.
	 * 
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// Print Statement in Java 
		System.out.println("Hello, World!"); // Print the info & go to next line
		
		// Print the info and stay on the same line
		System.out.print("Hello, ");
		System.out.print("World!");
		System.out.println();
		
		// Print the formatted content and then stay on the same line.
		System.out.printf("Abhinav is Completed M.Tech, Emp Id is 1234 and Visa Status is: true");
		System.out.println();
		
		System.out.printf("Jyothi is Completed M.Sc, Emp Id is 1235 and Visa Status is: false");	
		System.out.println();		
		
		System.out.printf("%s is Completed M.Sc, Emp Id is %d and Visa Status is: %b","Bramhini", 1236, true );
		System.out.println();
		
		// Print the error messages in Java.
		System.err.print("There is Error in Line:42");
		System.out.println();
		
		// Print the logs 
		Logger logger = Logger.getLogger("SampleLogs");
		logger.info("Currently Line 49 is Executing");
		logger.warning("There is a warning at Line 50");
				
		// Print the Logs into text file for exporting the logs
		PrintWriter logs = new PrintWriter("C:\\Training\\Sep_2025_8PM\\AutomationTraining\\JavaTraining\\Logs.txt");
		logs.println(LocalDateTime.now()+"Line 57 is Executed");
		logs.println(LocalDateTime.now()+"Line 58 is Completed");
		logs.close();
		
		
	}

}
