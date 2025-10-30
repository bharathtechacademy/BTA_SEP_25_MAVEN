package stringOperations;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataConversions {

	public static void main(String[] args) {
		
		// Converting any other data type to string data type. ==> String.valueOf(data)
		int stdCode = 144;
		int phoneNumber = 123456;
		String stdCodeStr = String.valueOf(stdCode);
		System.out.println(stdCodeStr+phoneNumber);
		
		//Converting string data type to integer data type. ==> Integer.parseInt(stringData), Double.parseDouble(stringData)
		String balance = "  Account Balance is :  9999.99$  "; 
		balance = balance.replaceAll("[^0-9.]", ""); // Removing unwanted characters from the string.
		double balanceDouble = Double.parseDouble(balance);
		
		//Verify in my account balance is having minimum balance 10000$
		System.out.println(balanceDouble>=10000);
		
		//Converting today's date and time into string value to generate unique IDs.
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
		String dateTimeString = sdf.format(Calendar.getInstance().getTime());
		System.out.println("Unique ID: " + dateTimeString);

	}

}
