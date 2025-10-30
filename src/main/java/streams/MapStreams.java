package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreams {

	public static void main(String[] args) {
		
		List<String> empNames = List.of("John", "Jane", "Jack", "Doe");
		
		//add Mr. prefix to each name		
		List<String> newNames= empNames.stream().map(x-> "Mr."+x).collect(Collectors.toList());
		System.out.println(newNames);
		

	}

}
