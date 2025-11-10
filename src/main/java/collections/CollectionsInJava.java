package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsInJava {	

	public static void main(String[] args) {
		
		/***** Array  *****/	
		// Array is a data type , that can store multiple values with similar data type together at one place		

		String [] empNames = new String[3]; // This can hold 3 employee names.
		empNames[0] = "Bharath";
		empNames[1] = "ABC";
			
		System.out.println(empNames.length);	
		
		/**** Challenges with Arrays ****/
		// 1. Arrays are fixed in size
		// 2. Memory will be allocated at the beginning of creating array / static memory allocation
		// 3. Array allows similar data types only
		// 4. Modifications also not allowed
		
		/******* Collections Framework *******/

		// Advantages

		// 1. Collections are dynamic in size. that means , no need to declare the size at the beginning
		// 2. Memory will be allocated dynamically based on the data that we are going to add/store
		// 3. Collections allows different data types in same data structure
		// 4. Modifications are allowed
		
		
		// Major Collection Categories ==> List , Set , Map 
		
		//List ==> ArrayList , LinkedList
		
		// 1. List can store multiple values with similar data type together at one place by allocating the memory dynamically		
		// 2. List can follow dynamic memory allocation
		// 3. List allows modifications
		// 4. List allows duplicate values
		
		//Set ==> HashSet , LinkedHashSet , TreeSet
		
		// 1. Set can store multiple values with similar data type together at one place by allocating the memory dynamically
		// 2. Set can follow dynamic memory allocation
		// 3. Set allows modifications
		// 4. Set does not allow duplicate values
		
		//Map ==> HashMap , LinkedHashMap , TreeMap, Hashtable
		
		// 1. Map can store multiple values with different data types in the form of key and value together at one place by allocating the memory dynamically
		// 2. Map can follow dynamic memory allocation
		// 3. Map allows modifications
		// 4. Map does not allow duplicate keys, but allows duplicate values
		
		// Differences between each sub categories of List , Set and Map 
		
		// Order of Storing the values : Insertion Order , Random Order , Sorted Order
		// Allowing null values : Allowed / Not Allowed
		// Memory allocation techniques : Contiguous Memory Allocation / Non-Contiguous Memory Allocation
		
		
		//Hash ==> Random
		//Link ==> Insertion
		//Tree ==> Sorted / Ascending
		
		/*********** Wrapper Classes ************/
		
		//Wrapper classes are used to convert primitive data types into objects
		//byte --> Byte
		//short --> Short
		//int --> Integer
		//long --> Long
		//float --> Float
		//double --> Double
		//boolean --> Boolean
		//char --> Character
		
		/************************  ArrayList  *************************/
		
		System.out.println("********** ArrayList **********");
		// Syntax to Initialize: List<DataType> variable = new ArrayList<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the size: variable.size();
		// Syntax to get the value: variable.get(index);
	
		// Order of Storing : Insertion Order
		// Null values : Allowed
		// Memory allocation technique : Contiguous Memory Allocation	
		
		//Store Employee names using ArrayList
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add("John");
		empNamesArrayList.add("Bob");
		empNamesArrayList.add("John");
		empNamesArrayList.add(null);
		empNamesArrayList.remove("Bob");
		System.out.println(empNamesArrayList.size());
		System.out.println(empNamesArrayList.get(2));
		System.out.println(empNamesArrayList);		
		
		/************************  LinkedList  *************************/
		
		System.out.println("********** LinkedList **********");
		// Syntax to Initialize: List<DataType> variable = new LinkedList<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the size: variable.size();
		// Syntax to get the value: variable.get(index);
	
		// Order of Storing : Insertion Order
		// Null values : Allowed
		// Memory allocation technique : Non-Contiguous Memory Allocation	
		
		//Store Employee names using LinkedList
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add("John");
		empNamesLinkedList.add("Bob");
		empNamesLinkedList.add("John");
		empNamesLinkedList.add(null);
		empNamesLinkedList.remove("Bob");
		System.out.println(empNamesLinkedList.size());
		System.out.println(empNamesLinkedList.get(2));
		System.out.println(empNamesLinkedList);		
		
		
		/************************  HashSet  *************************/
		
		System.out.println("********** HashSet **********");
		// Syntax to Initialize: Set<DataType> variable = new HashSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the size: variable.size();		
	
		// Order of Storing : Random Order
		// Null values : Allowed
		
		//Store Employee names using HashSet
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add("John");
		empNamesHashSet.add("Bob");
		empNamesHashSet.add("Abhi");
		empNamesHashSet.add("Alice");
		empNamesHashSet.add("John");
		empNamesHashSet.add(null);
		empNamesHashSet.remove("Bob");
		System.out.println(empNamesHashSet.size());
//		System.out.println(empNamesHashSet.get(2));
		System.out.println(empNamesHashSet);		
		
		
		/************************  LinkedHashSet  *************************/
		
		System.out.println("********** LinkedHashSet **********");
		// Syntax to Initialize: Set<DataType> variable = new LinkedHashSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the size: variable.size();		
	
		// Order of Storing : Insertion Order
		// Null values : Allowed
		
		//Store Employee names using LinkedHashSet
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add("John");
		empNamesLinkedHashSet.add("Bob");
		empNamesLinkedHashSet.add("Abhi");
		empNamesLinkedHashSet.add("Alice");
		empNamesLinkedHashSet.add("John");
		empNamesLinkedHashSet.add(null);
		empNamesLinkedHashSet.remove("Bob");
		System.out.println(empNamesLinkedHashSet.size());
		System.out.println(empNamesLinkedHashSet);		
		
		
		/************************  TreeSet  *************************/
		
		System.out.println("********** TreeSet **********");
		// Syntax to Initialize: Set<DataType> variable = new TreeSet<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the size: variable.size();		
	
		// Order of Storing : Ascending Order
		// Null values : Not Allowed
		
		//Store Employee names using TreeSet
		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("Bharath");
		empNamesTreeSet.add("John");
		empNamesTreeSet.add("Bob");
		empNamesTreeSet.add("Abhi");
		empNamesTreeSet.add("Alice");
		empNamesTreeSet.add("John");
		//empNamesTreeSet.add(null);
		empNamesTreeSet.remove("Bob");
		System.out.println(empNamesTreeSet.size());
		System.out.println(empNamesTreeSet);		
		
		
		/************************  HashMap  *************************/
		
		System.out.println("********** HashMap **********");
		// Syntax to Initialize: Map<DataType,DataType> variable = new HashMap<DataType,DataType>(); Key & Value Pairs
		// Syntax to add data: variable.put(Key, Value);
		// Syntax to remove the data: variable.remove(Key);
		// Syntax to get the size: variable.size();		
	
		// Order of Storing : Random Order of Keys
		// Null values :  Allowed
		// Null Keys :  Allowed
		
		Map<Integer, Map<String,Map<Byte,Short>>> sampleMap = new HashMap<Integer,Map<String,Map<Byte,Short>>>();
		
		//Store Employee names & Emp Id's using HashMap
		Map<String, Integer> empNamesHashMap = new HashMap<String,Integer>();
		empNamesHashMap.put("Bharath", 101);
		empNamesHashMap.put("John", 102);
		empNamesHashMap.put("Bob", 103);
		empNamesHashMap.put("Abhi", 103);// Duplicate Value
		empNamesHashMap.put("Alice", 105);
		empNamesHashMap.put("John", 106); // Duplicate Key
		empNamesHashMap.put("Mark", null); // Null Value
		empNamesHashMap.put(null, 107); // Null Key
		System.out.println(empNamesHashMap.size());
		System.out.println(empNamesHashMap.get("Alice"));
		System.out.println(empNamesHashMap);
		
		/************************  LinkedHashMap  *************************/
		
		System.out.println("********** LinkedHashMap **********");
		// Syntax to Initialize: Map<DataType,DataType> variable = new LinkedHashMap<DataType,DataType>(); Key & Value Pairs
		// Syntax to add data: variable.put(Key, Value);
		// Syntax to remove the data: variable.remove(Key);
		// Syntax to get the size: variable.size();		
	
		// Order of Storing : Insertion Order of Keys
		// Null values :  Allowed
		// Null Keys :  Allowed
		
		//Store Employee names & Emp Id's using LinkedHashMap
		Map<String, Integer> empNamesLinkedHashMap = new LinkedHashMap<String,Integer>();
		empNamesLinkedHashMap.put("Bharath", 101);
		empNamesLinkedHashMap.put("John", 102);
		empNamesLinkedHashMap.put("Bob", 103);
		empNamesLinkedHashMap.put("Abhi", 103);// Duplicate Value
		empNamesLinkedHashMap.put("Alice", 105);
		empNamesLinkedHashMap.put("John", 106); // Duplicate Key
		empNamesLinkedHashMap.put("Mark", null); // Null Value
		empNamesLinkedHashMap.put(null, 107); // Null Key
		System.out.println(empNamesLinkedHashMap.size());
		System.out.println(empNamesLinkedHashMap.get("Alice"));
		System.out.println(empNamesLinkedHashMap);
		
		
		/************************  TreeMap  *************************/
		
		System.out.println("********** TreeMap **********");
		// Syntax to Initialize: Map<DataType,DataType> variable = new TreeMap<DataType,DataType>(); Key & Value Pairs
		// Syntax to add data: variable.put(Key, Value);
		// Syntax to remove the data: variable.remove(Key);
		// Syntax to get the size: variable.size();		
	
		// Order of Storing : Ascending Order of Keys
		// Null values :  Allowed
		// Null Keys :  Not Allowed
		
		//Store Employee names & Emp Id's using TreeMap
		Map<String, Integer> empNamesTreeMap = new TreeMap<String,Integer>();
		empNamesTreeMap.put("Bharath", 101);
		empNamesTreeMap.put("John", 102);
		empNamesTreeMap.put("Bob", 103);
		empNamesTreeMap.put("Abhi", 103);// Duplicate Value
		empNamesTreeMap.put("Alice", 105);
		empNamesTreeMap.put("John", 106); // Duplicate Key
		empNamesTreeMap.put("Mark", null); // Null Value
		//empNamesTreeMap.put(null, 107); // Null Key
		System.out.println(empNamesTreeMap.size());
		System.out.println(empNamesTreeMap.get("Alice"));
		System.out.println(empNamesTreeMap);

		/************************  Hashtable  *************************/
		
		System.out.println("********** Hashtable **********");
		// Syntax to Initialize: Map<DataType,DataType> variable = new Hashtable<DataType,DataType>(); Key & Value Pairs
		// Syntax to add data: variable.put(Key, Value);
		// Syntax to remove the data: variable.remove(Key);
		// Syntax to get the size: variable.size();		
	
		// Order of Storing : Random Order of Keys
		// Null values : Not Allowed
		// Null Keys :  Not Allowed
		
		//Store Employee names & Emp Id's using Hashtable
		Map<String, Integer> empNamesHashtable = new Hashtable<String,Integer>();
		empNamesHashtable.put("Bharath", 101);
		empNamesHashtable.put("John", 102);
		empNamesHashtable.put("Bob", 103);
		empNamesHashtable.put("Abhi", 103);// Duplicate Value
		empNamesHashtable.put("Alice", 105);
		empNamesHashtable.put("John", 106); // Duplicate Key
		//empNamesHashtable.put("Mark", null); // Null Value
		//empNamesHashtable.put(null, 107); // Null Key
		System.out.println(empNamesHashtable.size());
		System.out.println(empNamesHashtable.get("Alice"));
		System.out.println(empNamesHashtable);
		
		
		
	
				
				
		
		

	}

}
