package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("chicken");
		food.add("pasta");
		food.add("biryani");
		food.add("kabab");

		List<String> dessert = new ArrayList<String>();
		dessert.add("misti");
		dessert.add("rosogulla");
		dessert.add("laddo");
		dessert.add("yogurt");
		dessert.add("pastry");

		Map<String, List<String>> food1 = new HashMap<String, List<String>>();
		food1.put("Menu", food);
		food1.put("Dessert Menu", dessert);

		System.out.println("Printing HashMap by using For Each Loop :\n");
		for (Map.Entry<String, List<String>> FoodList : food1.entrySet()) {
			System.out.println(FoodList.getKey() + " ----> " + FoodList.getValue());
		}
		System.out.println("\n******************************\n");
		System.out.println("Printing HashMap by using Iterator :\n");
		Iterator<Map.Entry<String, List<String>>> it = food1.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, List<String>> pair = it.next();
			System.out.println(pair.getKey() + " --> " + pair.getValue());
		}


	}
}


