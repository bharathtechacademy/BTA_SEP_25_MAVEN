package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctStreams {

	public static void main(String[] args) {
		List<Integer> input = List.of(1, 2,2, 3, 4,4,4, 5, 6, 7,7, 8, 9,9, 10);

		List<Integer> distinctNumbers= input.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct Numbers: " + distinctNumbers);
		
	}

}
