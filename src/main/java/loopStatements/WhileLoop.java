package loopStatements;

public class WhileLoop {

//	while(condition-to-begin) {
	
		//condition to break
//		//code
//	}

	public static void main(String[] args) {

		int i = 1;

		while (i > 0) {
			
			boolean isPageDisplayed = false;
			
			if(i==10 || isPageDisplayed) {
				break; // break the loop if 'i'became 10 or page is loaded
			}
			
			System.out.println("Refresh the Page");
			
			i++;
		}

	}

}
