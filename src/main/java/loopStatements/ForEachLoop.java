package loopStatements;

import java.util.HashSet;
import java.util.Set;

public class ForEachLoop {
	
	//For each loop will be used to iterate over pre-defined values in arrays or collections.
	
//	for ( Datetype variable: pre-definedList) {
//		
//	}

	public static void main(String[] args) {
		
		String[] newEmpNames = new  String[4] ;
		newEmpNames[0]="Teja";
		newEmpNames[1]="Afreen";
		newEmpNames[2]="Arayan";
		newEmpNames[3]="Bharath";
		
		//for-loop
		for(int i=0; i<newEmpNames.length ; i++) {
			System.out.println(newEmpNames[i]);
		}
		
		//for-each loop
		for(String value : newEmpNames) {
			System.out.println(value);
		}
		
		
		//for-loop for set won't work
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add("John");
		empNamesHashSet.add("Bob");
		empNamesHashSet.add("Abhi");
		empNamesHashSet.add("Alice");
		empNamesHashSet.add("John");
		empNamesHashSet.add(null);
		
		//for-each loop
		for(String value : empNamesHashSet) {
			System.out.println(value);
		}
		

	}

}
