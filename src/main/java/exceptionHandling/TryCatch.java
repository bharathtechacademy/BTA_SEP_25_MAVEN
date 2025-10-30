package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {

		String countries[] = new String[5];

		try {
			countries[0] = "USA";
			countries[1] = "UK";
			countries[2] = "India";
			countries[3] = "Germany";
			countries[4] = "France";
			countries[5] = "Canada";
		} catch (Exception e) {
			System.out.println("There is problem with Array");
			System.out.println(e.getLocalizedMessage());
			countries[5] = "Canada";
		} finally {
			System.out.println("Execution Completed"); // mandatory code to be executed
		}
		
		

	}

}
