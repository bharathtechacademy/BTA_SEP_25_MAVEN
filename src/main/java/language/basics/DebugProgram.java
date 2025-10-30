package language.basics;

public class DebugProgram {	

	public static void main(String[] args) {
        int i = 1;
        System.out.println("Step 1: Program starts");
        System.out.println("Step 2: Preparing to execute next step");
        System.out.println("Step 3: Performing calculations");
        int j = i + 1;
        System.out.println(i / j);
        System.out.println("Step 5: Program execution completed");
	}

}

//Last line of error message will display the line number along with hyperlink where we got Error
//First line of error message will display the details of Error and Location of Error documentation

/**
 * Main method to execute the program.
 *
 * <p>
 * Debugging Features in Eclipse:
 * - Breakpoints: Add a breakpoint by double-clicking on the left margin next to a line number.
 * - Step Over (F6): Execute the current line and pause at the next line.
 * - Step Into (F5): Enter the method call to debug it line by line.
 * - Step Out (F7): Exit the current method and return to the caller.
 * - Resume (F8): Continue execution until the next breakpoint or the end of the program.
 * - Variables View: Inspect and modify variable values during debugging.
 * - Breakpoints View: Manage all breakpoints in the program.
 * - Console View: Observe program outputs and exceptions.
 * </p>
 */