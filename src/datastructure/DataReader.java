package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */
		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try {

			fileReader = new FileReader(textFile);
			System.out.println("File Path: " + textFile);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("File not found");

		}
		String data = "";
		String storeData = "";

		try {

			bufferedReader = new BufferedReader(fileReader);

			while ((data = bufferedReader.readLine()) != null) {
				storeData += data;
				System.out.println(storeData);

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("SORRY! File not found");

		} finally {

			if (fileReader != null) {
				fileReader = null;

			}

			if (bufferedReader != null) {

				bufferedReader = null;

			}

		}


		String[] storeArray = storeData.split(" ");
		List<String> storeList = new LinkedList<String>();
		Stack<String> storeStack = new Stack<String>();


		for (String element : storeArray) {

			storeList.add(element);

			storeStack.push(element);

		}

		System.out.println("LinkedList FIFO:");

		Iterator<String> itr = storeList.iterator();

		while (itr.hasNext()) {

			System.out.print(itr.next() + " ");

		}


		System.out.println("Stack FILO:");


		while (!storeStack.isEmpty()) {

			System.out.print(storeStack.pop() + " ");

		}

		System.out.println(storeStack.push("Hello!"));
		System.out.println(storeStack.search("Tesla"));
		System.out.println(storeStack.peek());
		System.out.println(storeStack.empty());


	}
}
