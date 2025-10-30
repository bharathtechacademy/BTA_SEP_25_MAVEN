package streams;

import java.util.ArrayList;
import java.util.List;

public class MapNormal {

	public static void main(String[] args) {
		
		List<String> empNames = List.of("John", "Jane", "Jack", "Doe");
		
		//add Mr. prefix to each name
		
		List<String> newNames= new ArrayList<String>();
		
		for(String name : empNames) {
			newNames.add("Mr. " + name);
		}
		
		System.out.println("Names with Prefix: " + newNames);

	}

}
