package language.basics;

public class DataTypes {

	public static void main(String[] args) {
		
		// 1.Temperature of a city in degrees Celsius: 25.5
		float temperature = 25.5f;
		System.out.println("Temperature of City : "+temperature);
		
		// 2.Whether a customer has placed an order: true or false
		boolean orderPlaced = true;
		System.out.println("Order Status :"+orderPlaced);
		
		byte age = 30; //1 byte = 8 bits ==> 2^8 = 256 values (-128 to 127)
//		byte maxByteValue = 128;
		
		long population = 7800000000L; //8 bytes = 64 bits ==> 2^64 values
		float price = 10.99f; //4 bytes = 32 bits ==> 2^32 values
		
		String productName = "Washing Machine"; //Reference Data Type		
		System.out.println(productName.length());
		
		//length() - method to find the length of the string /total characters in the string
		//length - property to find the size of an array / total elements in the array
		//size() - method to find the size of a collection / total elements in the collection

	}

}
