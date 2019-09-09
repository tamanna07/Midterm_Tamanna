package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> name = new ArrayList<>();

		name.add("Tamanna");
		name.add("Bob");
		name.add("Sawar");
		name.add("Dimitri");
		name.add("Raihan");
		name.add("Rifath");

		System.out.println("Retrieve data from ArrayList: " + name);
		System.out.println("Peek element: " + name.get(2));
		System.out.println("Remove element at index 4: " + name.remove(4));
		System.out.println("After finsihing all these, retrieve data from ArrayList: " + name);

		System.out.println("By using for Loop: ");
		for (String rt : name) {
			System.out.println(" "+rt);
		}
		System.out.println();

		System.out.println("using while Loop with Iterator: ");
		Iterator it = name.iterator();
		while (it.hasNext()) {
			String f = (String) it.next();
			System.out.println(" "+f);
		}
		System.out.println();

		Collections.sort(name);
		System.out.println("After sorting, the ArrayList: "+name);


	}

}
