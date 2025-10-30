package streams;

import java.util.ArrayList;
import java.util.List;

public class FilterNormal {

	public static void main(String[] args) {
		
		List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> evenNumbers= new ArrayList<Integer>();
		
		for(Integer number : input) {
			if(number % 2 == 0) {
				evenNumbers.add(number);
			}
		}
		
		System.out.println("Even Numbers: " + evenNumbers);

	}

}
