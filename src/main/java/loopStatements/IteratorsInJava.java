package loopStatements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IteratorsInJava {
	
	// Iterators are default methods available with in the collections and these methods used to iterate a collection, such as a list or a set.

	// The Iterator interface provides three main methods:
	// hasNext(): Returns true if there are more elements to iterate over.
	// next(): Returns the next element in the iteration.
	// remove(): Removes the last element returned by the iterator from the underlying collection.
	public static void main(String[] args) {
		
		//List
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		
		Iterator<String> iteratorList = names.iterator();
		
		System.out.println("Iterating over List:");
		while(iteratorList.hasNext()) {
			System.out.println(iteratorList.next());
		}
		
		// Set
		Set<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);

		Iterator<Integer> iteratorSet = numbers.iterator();

		System.out.println("Iterating over List:");
		while (iteratorSet.hasNext()) {
			System.out.println(iteratorSet.next());
		}
		
		//Map
		Map<Integer, String> students = new HashMap<>();
        students.put(1, "John");
        students.put(2, "Emma");
        students.put(3, "Raj");
        
        Iterator<String> iteratorMapValues = students.values().iterator();
        System.out.println("Iterating over Map Values:");
		while (iteratorMapValues.hasNext()) {
			System.out.println(iteratorMapValues.next());
		}
	}

}
