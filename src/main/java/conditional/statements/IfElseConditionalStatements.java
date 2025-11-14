package conditional.statements;

public class IfElseConditionalStatements {

	/*
	 * Example: if / else if / else ---------------------------- Syntax:
	 * 
	 * if (condition1) { // Executes if condition1 is true } else if (condition2) {
	 * // Executes if condition2 is true } else if (condition3) { // Executes if
	 * condition3 is true } else { // Executes if none of the above conditions are
	 * true }
	 */

	/*
	 * Example: if / else if / else ---------------------------- Syntax:
	 * 
	 * if (condition1) { if(internalCondition){ }else{
	 * 
	 * }
	 *
	 * } else if (condition2) { // Executes if condition2 is true } else if
	 * (condition3) { // Executes if condition3 is true } else { // Executes if none
	 * of the above conditions are true }
	 */

	public static void main(String[] args) {

		// main if-else
		boolean isPrabashMovieAvailable = true;
		boolean isMaheshMovieAvailable = false;
		boolean isVenkyMovieAvailable = false;

		// nested if else
		boolean isReclinersAvailable = false;
		boolean isBolconyAvailable = true;

		if (isPrabashMovieAvailable) {
			System.out.println("Watch Rajni Movie");

			if (isReclinersAvailable) {
				System.out.println("Sit in Recliners");
			} else if (isBolconyAvailable) {
				System.out.println("Sit in Bolcony");
			} else {
				System.out.println("Sit in Normal Seat");
			}

		} else if (isMaheshMovieAvailable) {
			System.out.println("Watch Allu Arjun Movie");
		} else if (isVenkyMovieAvailable) {
			System.out.println("Watch Chiru Movie");
		} else {
			System.out.println("Watch Web Series at Home");
		}

	}

}
