package streams;

import java.util.ArrayList;
import java.util.List;

public class DistinctNormal {

	public static void main(String[] args) {
		
		List<Integer> input = List.of(1, 2,2, 3, 4,4,4, 5, 6, 7,7, 8, 9,9, 10);

		List<Integer> distinctNumbers= new ArrayList<Integer>();
		
		for(Integer number : input) {
			if(!distinctNumbers.contains(number)) {
				distinctNumbers.add(number);
			}
		}
		
		System.out.println("Distinct Numbers: " + distinctNumbers);
		
	}

}
