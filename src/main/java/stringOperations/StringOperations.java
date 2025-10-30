package stringOperations;

public class StringOperations {

	public static void main(String[] args) {
		
		//Store a string in a variable
		String value =" Username : Admin | Password : admin123 ";
		
		//Total number of characters available within the string. ==> String.length()
		System.out.println("Total number of characters: " + value.length());
		
		//Get the specific character from a specific index within the string. ==> String.charAt(index)
		System.out.println("Character at index 5: " + value.charAt(5));
		
		//Reverse the string. 
		String reversedString = "";
		
		for(int i=value.length()-1; i>=0; i--) {
			reversedString = reversedString + value.charAt(i);
		}
		System.out.println("Reversed String: " + reversedString);
		
		//Removing unwanted spaces from the string. ==> String.trim()
		String trimmedString = value.trim();
		System.out.println("Non-Trimmed String: '" + value + "'");
		System.out.println("Trimmed String: '" + trimmedString + "'");
		
		//Remove all the spaces from the string. ==> String.replace(oldChar, newChar)
		String stringWithoutSpaces = value.replace(" ", "");
		System.out.println("String without spaces: '" + stringWithoutSpaces + "'");
		
		//Remove all the alphabets from the string. ==> String.replaceAll(regExp, newChar)
		String stringWithoutAlphabets = value.replaceAll("[a-zA-Z]", "");
		System.out.println("String without alphabets: '" + stringWithoutAlphabets + "'");
		
		//Remove all the numbers from the string. ==> String.replaceAll(regExp, newChar)
		String stringWithoutNumbers = value.replaceAll("[0-9]", "");
		System.out.println("String without numbers: '" + stringWithoutNumbers + "'");
		
		//Remove all the special chars from the string. ==> String.replaceAll(regExp, newChar)
		String stringWithoutSpecialChars = value.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println("String without special chars: '" + stringWithoutSpecialChars + "'");
		
		//Convert the entire string to upper case. ==> String.toUpperCase()
		String upperCaseString = value.toUpperCase();
		System.out.println("Upper Case String: '" + upperCaseString + "'");
		
		//Convert the entire string to lower case. ==> String.toLowerCase()
		String lowerCaseString = value.toLowerCase();
		System.out.println("Lower Case String: '" + lowerCaseString + "'");
		
		//Extract specific part of the string. ==> String.substring(beginIndex, endIndex+1) , String.substring(beginIndex)
		String substring1 = value.substring(12, 17); // Extracts "Admin"
		System.out.println("Substring (12 to 16): '" + substring1 + "'");
		String substring2 = value.substring(31); // Extracts "admin123 "
		System.out.println("Substring (31 to end): '" + substring2 + "'");
		
		//Split the string based on a specific character. ==> String.split(regex)
		String[] splitValues = value.split(" ");
		System.out.println("Username:"+ splitValues[3] + ", Password:" + splitValues[7]);
		
		System.out.println("--------------------------------------------------");
		System.out.println(value);
		
		//Compare the string values.
		//equals() ==> exact match (case-sensitive)
		//equalsIgnoreCase() ==> exact match (not case-sensitive)
		//contains() ==> partial match (case-sensitive)
		//startsWith() ==> checks starting sequence (case-sensitive)
		//endsWith() ==> checks ending sequence (case-sensitive)
		
		String name ="Bharath";
		System.out.println("equals: " + name.equals("bharath")); // false
		System.out.println("equalsIgnoreCase: " + name.equalsIgnoreCase("bharath")); // true
		System.out.println("contains: " + name.contains("hara")); // true
		System.out.println("contains: " + name.contains("Hara")); // false
		System.out.println("startsWith: " + name.startsWith("Bha")); // true
		System.out.println("endsWith: " + name.endsWith("rath")); // true
		
		//Verify if the string is empty (not even white space) or blank (white space allowed).
		String emptyString = "";
		String blankString = "   ";
		System.out.println("Is emptyString empty? " + emptyString.isEmpty()); // true
		System.out.println("Is blankString empty? " + blankString.isEmpty()); // false
		
		System.out.println("Is emptyString blank? " + emptyString.isBlank()); // true
		System.out.println("Is blankString blank? " + blankString.isBlank()); // true
		
		
		// String vs StringBuffer and StringBuilder
		
		// String is immutable
		// StringBuffer and StringBuilder are mutable
		
		// StringBuffer is synchronized (thread-safe)
		// StringBuilder is not synchronized (not thread-safe)
		
		//immutable example
		String str = "Bharath ";
		str.concat("Reddy");
		System.out.println(str); 
		
		//mutable example with StringBuffer
		StringBuffer strBuf = new StringBuffer("Bharath ");
		strBuf.append("Reddy");
		System.out.println(strBuf);
		
		//mutable example with StringBuilder
		StringBuilder strBld = new StringBuilder("Bharath ");
		strBld.append("Reddy");
		System.out.println(strBld);
		
		

	}

}
