package com.infotech.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.infotech.model.Department;
import com.infotech.model.Employee;

public class ClientTest {

	public static void main(String[] args) {

		Employee e1 = new Employee(1009, "Sam", 90000.00, "sam@infotech.com");
		Employee e2 = new Employee(2009, "Ambay", 30000.00, "martin@infotech.com");
		Employee e3 = new Employee(3009, "Joya", 50000.00, "joya@infotech.com");
		Employee e4 = new Employee(4009, "Boya", 70000.00, "harry@infotech.com");
		Employee e5 = new Employee(5009, "Sean", 80000.00, "sean@infotech.com");

		Department d1 = new Department(10001, "IT", "Boston");
		Department d2 = new Department(10002, "Finance", "Chennai");

		Map<Employee, Department> empDeptMap = new TreeMap<>();

		empDeptMap.put(e1, d1);
		empDeptMap.put(e2, d1);
		empDeptMap.put(e3, d1);

		empDeptMap.put(e4, d2);
		empDeptMap.put(e5, d2);

		// empDeptMap.put(null, d1);

		Set<Entry<Employee, Department>> entrySet = empDeptMap.entrySet();
		Iterator<Entry<Employee, Department>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Employee, Department> entry = (Map.Entry<Employee, Department>) iterator.next();
			Employee employee = entry.getKey();
			Department department = entry.getValue();
			System.out.println(employee);
			System.out.println(department);
		}

		/*
		 * 
		 * Creation of Linked List
		 * 
		 */
		LinkedList<String> friends = new LinkedList<>();
		friends.add("Ankit");
		friends.add("Ashu");
		friends.add("Davis");
		friends.add("Chris");
		friends.add("Rajeev");
		friends.add("John");

		System.out.println("=========Printing Initial Linked List========= \n\t" + friends);

		/*
		 * Adding an element in an specific position
		 */
		friends.add(3, "Stephen Fleming");
		System.out.println(friends);

		/*
		 * Adding an element to last index
		 * 
		 */

		friends.addLast("Jeniffer");
		System.out.println(friends);

		/*
		 * Checking size
		 * 
		 */
		System.out.println(friends.size());

		/*
		 * Combining to list on a single list
		 */
		List<String> familyfriends = new ArrayList<>();
		familyfriends.add("Jesse");
		familyfriends.add("Steve Smith");
		familyfriends.add("Glenn Macgrath");

		friends.addAll(familyfriends);
		System.out.println("After addAll(familyFriends) : " + friends);

		/*
		 * Searching an element of Linked List
		 * 
		 */
		LinkedList<String> employees = new LinkedList<>();
		employees.add("John");
		employees.add("David");
		employees.add("Lara");
		employees.add("Chris");
		employees.add("Steve");
		employees.add("David");

		/*
		 * 
		 * Check if the LinkedList contains an element
		 */
		System.out.println("Does Employees LinkedList contain \"Lara\"? : " + employees.contains("Lara"));

		/*
		 * Find the index of the first occurrence of an element in the LinkedList
		 */

		System.out.println("indexOf \"Steve\" : " + employees.indexOf("Steve"));
		System.out.println("indexOf \"Mark\" : " + employees.indexOf("Mark"));

		System.out.println("lastIndexOf \"David\" : " + employees.lastIndexOf("David"));
		System.out.println("lastIndexOf \"Bob\" : " + employees.lastIndexOf("Bob"));

		/*
		 * Removing an specific element from list
		 */
		LinkedList<String> programmingLanguages = new LinkedList<>();
		programmingLanguages.add("Assembly");
		programmingLanguages.add("Fortran");
		programmingLanguages.add("Pascal");
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("C#");
		programmingLanguages.add("Kotlin");

		System.out.println("Initial LinkedList" + programmingLanguages);

		// Remove the first element in the LinkedList
		String element = programmingLanguages.removeFirst(); // Throws NoSuchElementException if the LinkedList is empty
		System.out.println("Removed the first element " + element + " => " + programmingLanguages);

		// Removing the last element

		element = programmingLanguages.removeLast();
		System.out.println("Removed the last element " + element + " => " + programmingLanguages);

		/*
		 * Removing the first occurence of the element
		 */
		boolean isRemoved = programmingLanguages.remove("C#");
		if (isRemoved) {

			System.out.println("Removed C# => " + programmingLanguages);
		}

		// Remove all the elements that satisfy the given predicate
		programmingLanguages.removeIf(programmingLanguage -> programmingLanguage.startsWith("C"));
		System.out.println("Removed elements starting with C => " + programmingLanguages);

		// Clear the LinkedList by removing all elements
		programmingLanguages.clear();
		System.out.println("Cleared the LinkedList => " + programmingLanguages);

	}
}
