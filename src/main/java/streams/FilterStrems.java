package streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStrems {

	public static void main(String[] args) {
		List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNumbers = input.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers: " + evenNumbers);

	}

}
